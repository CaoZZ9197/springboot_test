package com.atcz.service;/*
@author cz
@create 2020-12-30 16:25 
*/

import com.atcz.bean.Pet;
import com.atcz.bean.User;

public class UserServiceImpl implements UserService{


    @Override
    public Pet getPetsByUser(User user) {
        return user.getPet();
    }
}
