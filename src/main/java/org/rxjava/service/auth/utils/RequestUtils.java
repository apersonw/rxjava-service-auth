package org.rxjava.service.auth.utils;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;
import org.rxjava.service.auth.constant.AuthConstants;
import org.springframework.util.Base64Utils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Slf4j
public class RequestUtils {


    public static HttpServletRequest getRequest() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return request;
    }

    public static JSONObject getJwtPayload() throws JSONException {
        String jwtPayload = getRequest().getHeader(AuthConstants.JWT_PAYLOAD_KEY);
        return new JSONObject(jwtPayload);
    }

    public static Long getUserId() throws JSONException {
        Long id = getJwtPayload().getLong(AuthConstants.USER_ID_KEY);
        return id;
    }


    public static String getUsername() throws JSONException {
        String username = getJwtPayload().getString(AuthConstants.USER_NAME_KEY);
        return username;
    }

    /**
     * 获取JWT的载体中的clientId
     *
     * @return
     */
    public static String getClientId() throws JSONException {
        String clientId = getJwtPayload().getString(AuthConstants.CLIENT_ID_KEY);
        return clientId;
    }

    /**
     * 获取登录认证的客户端ID
     * <p>
     * 兼容两种方式获取Oauth2客户端信息（client_id、client_secret）
     * 方式一：client_id、client_secret放在请求路径中
     * 方式二：放在请求头（Request Headers）中的Authorization字段，且经过加密，例如 Basic Y2xpZW50OnNlY3JldA== 明文等于 client:secret
     *
     * @return
     */
    @SneakyThrows
    public static String getAuthClientId() {
        String clientId;

        HttpServletRequest request = getRequest();

        // 从请求路径中获取
        clientId = request.getParameter(AuthConstants.CLIENT_ID_KEY);
        if (StringUtils.isNotBlank(clientId)) {
            return clientId;
        }

        // 从请求头获取
        String basic = request.getHeader(AuthConstants.AUTHORIZATION_KEY);
        basic = request.getHeader(AuthConstants.AUTHORIZATION_KEY);
        if (StringUtils.isNotBlank(basic) && basic.startsWith(AuthConstants.BASIC_PREFIX)) {
            basic = basic.replace(AuthConstants.BASIC_PREFIX, Strings.EMPTY);
            String basicPlainText = new String(Base64Utils.decodeFromString(basic), "UTF-8");
            clientId = basicPlainText.split(":")[0]; //client:secret
        }
        return clientId;
    }
}
