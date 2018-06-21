package com.linux.huhx.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: huhx
 * @Date: 2017-12-24 下午 10:37
 * @Desc:
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String userService() {
        return restTemplate.getForObject("http://SERVICE0/user/name", String.class);
    }
}
