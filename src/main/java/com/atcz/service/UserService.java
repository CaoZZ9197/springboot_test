package com.atcz.service;/*
@author cz
@create 2020-12-30 16:26 
*/

import com.atcz.bean.Pet;
import com.atcz.bean.User;
import org.apache.coyote.Response;

public interface UserService {
    Pet getPetsByUser(User user);

}
