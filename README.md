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
