package com.atcz.bean;/*
@author cz
@create 2021-01-07 16:23 
*/

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@ConfigurationProperties(prefix = "person")
@Component
@ToString
@Data
public class Person {
    private String name;
    private Integer age;
    private Long id;
    private Car car;
    private Cat pet;
    private String[] interests;
}
