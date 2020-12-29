package org.rxjava.service.auth.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.config.annotation.builders.InMemoryClientDetailsServiceBuilder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;

/**
 * 配置认证服务器
 */
@Configuration
@EnableAuthorizationServer // 开启认证服务
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private UserDetailsService userDetailsService;
    //@Autowired
    //private SecurityProperty securityProperty;
    @Autowired
    private TokenStore tokenStore;

    /**
     * 用来配置授权（authorization）以及令牌（token）的访问端点和令牌服务(token services)
     */
    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) {
        // 配置存储token的方式(默认InMemoryTokenStore)
        endpoints.tokenStore(tokenStore)
                // 密码模式，必须配置AuthenticationManager，不然不生效
                .authenticationManager(authenticationManager)
                // 密码模式，这里得配置UserDetailsService
                .userDetailsService(userDetailsService);
        /*
         * pathMapping用来配置端点URL链接，有两个参数，都将以 "/" 字符为开始的字符串
         * defaultPath：这个端点URL的默认链接
         * customPath：你要进行替代的URL链接
         */
        endpoints.pathMapping("/oauth/token", "/oauth/xwj");
    }

    /**
     * 用来配置客户端详情服务(给谁发送令牌)
     */
    @Override
    public void configure(final ClientDetailsServiceConfigurer clients) throws Exception {
        InMemoryClientDetailsServiceBuilder builder = clients.inMemory();
        //OAuth2ClientProperty[] oauth2Clients = securityProperty.getOauth2().getClients();
        //if (ArrayUtils.isNotEmpty(oauth2Clients)) {
        //    for (OAuth2ClientProperty config : oauth2Clients) {
        //        builder // 使用in-memory存储
        //                .withClient(config.getClientId()).secret(config.getClientSecret())
        //                .accessTokenValiditySeconds(config.getAccessTokenValiditySeconds()) // 发出去的令牌有效时间(秒)
        //                .authorizedGrantTypes("authorization_code", "client_credentials", "password", "refresh_token") // 该client允许的授权类型
        //                .scopes("all", "read", "write") // 允许的授权范围(如果是all，则请求中可以不要scope参数，否则必须加上scopes中配置的)
        //                .autoApprove(true); // 自动审核
        //    }
        //}
    }

}
