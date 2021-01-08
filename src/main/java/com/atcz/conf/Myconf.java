package com.atcz.conf;

import com.atcz.bean.Cat;
import com.atcz.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author kuxiong
 * @Date:2020/12/28 17:39
 */

@Import(Cat.class)
@Configuration
public class Myconf {
    @Bean
    public User user01(){return new User();}


}
