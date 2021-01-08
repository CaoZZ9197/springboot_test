package com.atcz.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author kuxiong
 * @Date:2020/12/28 17:32
 */
@Data
public class User {

    Long Id;
    String Name;

    @Autowired
    Pet pet;
}
