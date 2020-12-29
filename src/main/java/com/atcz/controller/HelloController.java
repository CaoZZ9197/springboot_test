package com.atcz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author kuxiong
 * @Date:2020/12/28 17:13
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello,spring boot!";
    }
}
