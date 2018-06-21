package com.linux.huhx.client.business;

import com.linux.huhx.client.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: huhx
 * @Date: 2017-12-24 下午 10:42
 * @Desc:
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/user")
    public String sayUserName() {
        return helloService.userService();
    }
}
