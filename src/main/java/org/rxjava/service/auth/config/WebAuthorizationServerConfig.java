package org.rxjava.service.auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;

/**
 * 认证服务器配置
 *
 * @author happy
 */
@Configuration
@EnableAuthorizationServer
public class WebAuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

    /**
     * 该对象用来支持 password 模式
     */
    private final AuthenticationManager authenticationManager;

    /**
     * 该对象用来将令牌信息存储到内存中
     */
    private final TokenStore tokenStore;

    /**
     * 密码编码器
     */
    private final PasswordEncoder passwordEncoder;

    private final UserDetailsService userDetailsService;

    public WebAuthorizationServerConfig(AuthenticationManager authenticationManager,
                                        TokenStore tokenStore,
                                        PasswordEncoder passwordEncoder,
                                        UserDetailsService userDetailsService
    ) {
        this.authenticationManager = authenticationManager;
        this.tokenStore = tokenStore;
        this.passwordEncoder = passwordEncoder;
        this.userDetailsService = userDetailsService;
    }

    /**
     * 配置客户端授权模式
     */
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient("order-client")
                .secret(passwordEncoder.encode("order-secret-8888"))
                .authorizedGrantTypes("refresh_token", "authorization_code", "password")
                .accessTokenValiditySeconds(3600)
                .scopes("all")
                .and()
                .withClient("user-client")
                .secret(passwordEncoder.encode("user-secret-8888"))
                .authorizedGrantTypes("refresh_token", "authorization_code", "password")
                .accessTokenValiditySeconds(3600)
                .scopes("all");
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) {
        endpoints.authenticationManager(authenticationManager)
                .userDetailsService(userDetailsService)
                .tokenStore(tokenStore);
    }

    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) {
        //允许客户端访问 OAuth2 授权接口，否则请求 token 会返回 401
        security.allowFormAuthenticationForClients();
        //允许已授权用户访问 checkToken 接口
        security.checkTokenAccess("isAuthenticated()");
        //允许已授权用户访问获取 token 接口
        security.tokenKeyAccess("isAuthenticated()");
    }
}
