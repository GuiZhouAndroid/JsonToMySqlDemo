package com.example.demo.config;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;

/**
 * @Created: by 2022-07-14 15:45
 * @Description: 前后台交互的时候往往使用json格式的字段串参数，其中含有“{}”“[]”这些特舒符号
 * 在高版本的tomcat中含有这些字符的请求会被拦截
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @Github: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
//@Configuration
public class TomcatConfig {

    //在方法中我们加入了 "<>[\]^`{|}这些符号
    @Bean
    public TomcatServletWebServerFactory webServerFactory() {
        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
        factory.addConnectorCustomizers((Connector connector) -> {
            connector.setProperty("relaxedPathChars", "\"<>[\\]^`{|}");
            connector.setProperty("relaxedQueryChars", "\"<>[\\]^`{|}");
        });
        return factory;
    }
}

