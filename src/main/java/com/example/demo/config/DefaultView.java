package com.example.demo.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Created: by 2022-07-14 13:07
 * @Description: 设置 http://localhost:8080 默认启动页
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @Github: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
@Configuration
public class DefaultView extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry reg) {
        // reg.addViewController("/").setViewName("formdata");//默认访问页面
        // reg.addViewController("/").setViewName("mapdata");
        //reg.addViewController("/").setViewName("dhdata");
        //reg.addViewController("/").setViewName("xiehouyu");
        reg.addViewController("/").setViewName("formdata");
        reg.setOrder(Ordered.HIGHEST_PRECEDENCE);//最先执行过滤
        super.addViewControllers(reg);
    }
}
