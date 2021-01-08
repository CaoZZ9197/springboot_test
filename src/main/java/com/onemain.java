package com;

import com.atcz.bean.Car;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author kuxiong
 * @Date:2020/12/28 17:09
 */

@SpringBootApplication(scanBasePackages = "com.atcz")
@ComponentScan("com.atcz")
public class onemain {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(onemain.class, args);
        Object car =(Car) run.getBean(Car.class);
        System.out.println(car);
    }
}
