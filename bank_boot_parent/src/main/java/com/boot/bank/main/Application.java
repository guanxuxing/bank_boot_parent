package com.boot.bank.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p>Created by gxx on 2017-08-25.
 * <p>此demo采用纯注解开发
 * <p>配置依赖自动注入
 * <p>配置依赖扫描 (service && controller)
 * <p>配置mapper扫描，数据源自动注入
 * <p>网上有参考价值的信息: http://blog.csdn.net/gebitan505/article/details/54929287
 * <p>springboot内嵌tomcat，默认端口是8080，实际开发中需要用其它的端口，下面附修改端口的方法
 */
@SpringBootApplication
@EnableAutoConfiguration
@Configuration
@ComponentScan(value = "com.boot.bank")
@MapperScan(value = "com.boot.bank.mapper")
public class Application implements EmbeddedServletContainerCustomizer {

    public static void main(String[] args){
        System.out.println("strat.......");
        SpringApplication.run(Application.class);
        System.out.println("【sucess】");
    }

    /*****
     * <p>修改boot内置tomcat端口
     * @param configurableEmbeddedServletContainer
     */
    public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
        configurableEmbeddedServletContainer.setPort(8089);
    }
}
