package com.atlantis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description: 启动类
 * @copyright: Copyright (c) 2018
 * @author: 蔡宗生
 * @version: 1.0
 * @date: 2018 2018年7月30日 上午10:14:30
 */
@SpringBootApplication
@EnableEurekaServer
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
public class RegistryCenterApplication  extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(RegistryCenterApplication.class, args);
    }
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(RegistryCenterApplication.class);
    }
}


//@SpringBootApplication
//@EnableEurekaServer
//public class RegistryCenterApplication {
//
//    public static void main(String[] args) {
//        SpringApplication.run(RegistryCenterApplication.class, args);
//    }
//}