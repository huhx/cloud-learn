package com.linux.huhx.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: huhx
 * @Date: 2017-12-24 下午 9:39
 * @Desc:
 */
@SpringBootApplication
@EnableConfigServer
public class ServerConfigBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerConfigBootApplication.class);
    }
}
