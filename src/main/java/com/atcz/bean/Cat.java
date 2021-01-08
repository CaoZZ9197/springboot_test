package com.atcz.bean;

import lombok.Data;

/**
 * @Author kuxiong
 * @Date:2020/12/28 17:33
 */

@Data
public class Cat extends Pet{

    String Name;
    Long age;

    Cat(){}

    final String type="cat";

    @Override
    void eat() {
        System.out.println(this.Name+" is eating");
    }

    @Override
    void play() {
        System.out.println(this.Name+ " is playing");
    }
}
