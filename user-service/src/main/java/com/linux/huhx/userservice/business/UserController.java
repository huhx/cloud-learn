package com.linux.huhx.userservice.business;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: huhx
 * @Date: 2017-12-24 下午 9:46
 * @Desc:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("name")
    public String getUserServiceName() {
        return "user service.";
    }
}
