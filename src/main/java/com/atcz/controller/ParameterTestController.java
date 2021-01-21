package com.atcz.controller;/*
@author cz
@create 2021-01-16 10:39 
*/

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ParameterTestController {

    @GetMapping("/car/{id}")
    public Map<String,Object> getCar(@PathVariable("id") Integer id){
        Map<String,Object> map =new HashMap<>();
        map.put("id", id);




        return map;
    }
}
