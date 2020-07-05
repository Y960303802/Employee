package com.xizi.service;

import com.xizi.pojo.User;

public interface UserService {
    void register(User user);

    User login(String username,String password );
}
