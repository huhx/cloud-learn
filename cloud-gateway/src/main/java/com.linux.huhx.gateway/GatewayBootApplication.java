package com.linux.huhx.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author: huhx
 * @Date: 2017-12-24 下午 9:56
 * @Desc:
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class GatewayBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayBootApplication.class, args);
    }
}
