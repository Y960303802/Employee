package com.xizi.dao;

import com.xizi.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    void save(User user);

    User login(@Param("username") String name,@Param("password") String password);
}
