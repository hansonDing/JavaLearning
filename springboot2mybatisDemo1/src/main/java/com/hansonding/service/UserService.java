package com.hansonding.service;

import com.hansonding.pojo.User;

import java.util.List;

public interface UserService {
    User queryUserById(Integer id);
    int insert(User user);
    int updateUser(User user);
    int deleteUser(Integer id);
    List<User> getAllUser();
}
