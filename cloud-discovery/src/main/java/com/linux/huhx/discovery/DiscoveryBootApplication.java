package com.linux.huhx.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: huhx
 * @Date: 2017-12-24 下午 9:34
 * @Desc:
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryBootApplication.class, args);
    }
}
