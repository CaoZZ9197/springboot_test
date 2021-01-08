package com.atcz.bean;/*
@author cz
@create 2021-01-02 14:51 
*/

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "mycar")
public class Car {
    String brand;
    Integer price;

}
