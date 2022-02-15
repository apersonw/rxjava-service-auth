### 认证服务器端点配置：

1、token模式默认存储在内存中，服务重启后就没了。这里改为使用redis存储，同时也可用于客户端扩展集群

2、如果要使用密码模式，必须得配置AuthenticationManager(原因可查看源码AuthorizationServerEndpointsConfigurer的getDefaultTokenGranters方法)

3、在使用密码模式时，如果用户实现了UserDetailsService类，则在验证用户名密码时，使用自定义的方法。因为在校验用户名密码时，使用了DaoAuthenticationProvider中的retrieveUser方法(
具体可参考AuthenticationManager、ProviderManager）

4、默认获取token的路径是/oauth/token，通过pathMapping方法，可改变默认路径

当前存在的问题：用户名或密码错误

验证账号、密码，存储 token，检查 token ,刷新 token 等都是认证服务端的工作

```bash
curl --location --request GET 'http://localhost:8080/oauth/token?client_id=user-client&client_secret=user-secret-8888&username=&password' \
--header 'Connection: keep-alive' \
--header 'Pragma: no-cache' \
--header 'Cache-Control: no-cache' \
--header 'sec-ch-ua: " Not A;Brand";v="99", "Chromium";v="98", "Google Chrome";v="98"' \
--header 'sec-ch-ua-mobile: ?0' \
--header 'sec-ch-ua-platform: "macOS"' \
--header 'Upgrade-Insecure-Requests: 1' \
--header 'User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.80 Safari/537.36' \
--header 'Sec-Fetch-Site: none' \
--header 'Sec-Fetch-Mode: navigate' \
--header 'Sec-Fetch-User: ?1' \
--header 'Sec-Fetch-Dest: document' \
--header 'Accept-Language: zh-CN,zh;q=0.9' \
--header 'Cookie: JSESSIONID=B5DAEA82C0E0A847515C07F5BA8A710D'
```

```text
参考文章：https://juejin.cn/post/6844904095942180878#heading-4
```

client-id、client-secret创建的SQL的语句

```sql
create table oauth_client_details
(
    client_id               VARCHAR(256) PRIMARY KEY,
    resource_ids            VARCHAR(256),
    client_secret           VARCHAR(256),
    scope                   VARCHAR(256),
    authorized_grant_types  VARCHAR(256),
    web_server_redirect_uri VARCHAR(256),
    authorities             VARCHAR(256),
    access_token_validity   INTEGER,
    refresh_token_validity  INTEGER,
    additional_information  VARCHAR(4096),
    autoapprove             VARCHAR(256)
);
INSERT INTO oauth_client_details (client_id, client_secret, scope, authorized_grant_types, web_server_redirect_uri,
                                  authorities, access_token_validity, refresh_token_validity, additional_information,
                                  autoapprove)
VALUES ('user-client', '$2a$10$o2l5kA7z.Caekp72h5kU7uqdTDrlamLq.57M1F6ulJln9tRtOJufq', 'all',
        'authorization_code,refresh_token,password', null, null, 3600, 36000, null, true);
INSERT INTO oauth_client_details (client_id, client_secret, scope, authorized_grant_types, web_server_redirect_uri,
                                  authorities, access_token_validity, refresh_token_validity, additional_information,
                                  autoapprove)
VALUES ('order-client', '$2a$10$GoIOhjqFKVyrabUNcie8d.ADX.qZSxpYbO6YK4L2gsNzlCIxEUDlW', 'all',
        'authorization_code,refresh_token,password', null, null, 3600, 36000, null, true);
```

```text
假设咱们在一个 web 端使用，grant_type 是 password，表明这是使用 OAuth2 的密码模式。
username=admin 和 password=123456 就相当于在 web 端登录界面输入的用户名和密码，我们在认证服务端配置中固定了用户名是 admin 、密码是 123456，而线上环境中则应该通过查询数据库获取。
scope=all 是权限有关的，在认证服务的 OAuthConfig 中指定了 scope 为 all 。
Authorization 要加在请求头中，格式为 Basic 空格 base64(clientId:clientSecret)，这个微服务客户端的 client-id 是 user-client，client-secret 是 user-secret-8888，将这两个值通过冒号连接，并使用 base64 编码(user-client:user-secret-8888)之后的值为 dXNlci1jbGllbnQ6dXNlci1zZWNyZXQtODg4OA==，可以通过 https://www.sojson.com/base64.html 在线编码获取。
```