package com.atcz.controller;

import com.atcz.bean.Car;
import com.atcz.bean.Cat;
import com.atcz.bean.Person;
import com.atcz.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author kuxiong
 * @Date:2020/12/28 17:13
 */

@RestController
public class HelloController {

    @Autowired
    Car car;

    @Autowired
    Cat cat;

    @Autowired
    Person person;

    @RequestMapping("/car")
    public Car getCar(){
        return car;
    }
    @RequestMapping("/hello")
    public String hello(){
        return "hello,spring boot!";
    }

    @RequestMapping("/person")
    public Person person(){
        return person;

    }
}
