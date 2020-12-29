package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author kuxiong
 * @Date:2020/12/28 17:09
 */

@SpringBootApplication(scanBasePackages = "com.atcz")
public class onemain {

    public static void main(String[] args) {
        SpringApplication.run(onemain.class,args);
    }
}
