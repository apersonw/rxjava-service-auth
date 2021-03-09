package org.rxjava.service.auth.service;

import lombok.AllArgsConstructor;
import org.rxjava.service.auth.constant.AuthConstants;
import org.rxjava.service.auth.dto.AuthMemberDTO;
import org.rxjava.service.auth.dto.UserDTO;
import org.rxjava.service.auth.entity.User;
import org.rxjava.service.auth.result.Result;
import org.rxjava.service.auth.result.ResultCode;
import org.rxjava.service.auth.utils.RequestUtils;
import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


/**
 * 自定义用户认证和授权
 */
@Service
@AllArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserFeignService userFeignService;
    private MemberFeignService memberFeignService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String clientId = RequestUtils.getAuthClientId();

        User user = null;
        switch (clientId) {
            // 后台用户
            case AuthConstants.ADMIN_CLIENT_ID:
                Result<UserDTO> userRes = userFeignService.getUserByUsername(username);
                if (ResultCode.USER_NOT_EXIST.getCode().equals(userRes.getCode())) {
                    throw new UsernameNotFoundException(ResultCode.USER_NOT_EXIST.getMsg());
                }
                UserDTO userDTO = userRes.getData();
                userDTO.setClientId(clientId);
                user = new User(userDTO);
                break;
            // 小程序会员
            case AuthConstants.WEAPP_CLIENT_ID:
                Result<AuthMemberDTO> memberRes = memberFeignService.getUserByOpenid(username);
                if (ResultCode.USER_NOT_EXIST.getCode().equals(memberRes.getCode())) {
                    throw new UsernameNotFoundException(ResultCode.USER_NOT_EXIST.getMsg());
                }
                AuthMemberDTO authMemberDTO = memberRes.getData();
                authMemberDTO.setClientId(clientId);
                user = new User(authMemberDTO);
                break;
            default:
        }
        assert user != null;
        if (!user.isEnabled()) {
            throw new DisabledException("该账户已被禁用!");
        } else if (!user.isAccountNonLocked()) {
            throw new LockedException("该账号已被锁定!");
        } else if (!user.isAccountNonExpired()) {
            throw new AccountExpiredException("该账号已过期!");
        }
        return user;
    }

}
