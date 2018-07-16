package com.hansonding.mapper;

import com.hansonding.pojo.User;
import java.util.List;

public interface UserMapper {

    List<User> getAllUser();

    User getUserById(Integer id);

    int insert(User user);

    int deleteById(Integer id);

    int updateById(User user);
}
