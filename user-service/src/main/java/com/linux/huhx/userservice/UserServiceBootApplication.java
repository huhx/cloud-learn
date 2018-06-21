package com.linux.huhx.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Author: huhx
 * @Date: 2017-12-24 下午 9:44
 * @Desc:
 */

@SpringBootApplication(scanBasePackages = "com.linux.huhx.userservice")
@EnableEurekaClient
@EnableWebMvc
public class UserServiceBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceBootApplication.class, args);
    }
}
