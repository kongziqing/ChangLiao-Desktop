package cn.navigation.education.changliao.config;

import io.vertx.core.json.JsonObject;

public class Constant {
    public static final JsonObject VERTICLE_CONFIG = new JsonObject()
            .put("server", "polyglot.net.cn")
            .put("http_port", 80)
            .put("tcp_port", 7373);
    public static final String SERVER = "server";
    public static final String HTTP_PORT = "http_port";
    public static final String TCP_ORT = "tcp_port";
    public static final String LOGIN = "login";
    public static final String LOGIN_URL ="/user/login";
    public static final String TYPE = "type";
    public static final String SUBTYPE = "subtype";
    public static final String ACCOUNT = "account";
    public static final String USERNAME = "userName";
    public static final String PASSWORD ="password";
    public static final String VERSION ="version";
    public static final String CURRENT_CURSION ="0.2";
    public static final String USER = "user";
    public static final String ID ="id";
    public static final String END ="\r\n";
    public static final String FRIENDS = "friends";
    public static final String NICKNAME ="nickname";


}
