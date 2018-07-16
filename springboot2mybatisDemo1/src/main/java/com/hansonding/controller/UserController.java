package com.hansonding.controller;

import com.alibaba.fastjson.JSONObject;
import com.hansonding.pojo.User;
import com.hansonding.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/queryUserById", method = RequestMethod.GET)
    public JSONObject getUserById(@RequestParam(name="id") Integer id){
        User user = userService.queryUserById(id);
        JSONObject json = new JSONObject();
        json.put("result",user);
        return json;
    }

    @RequestMapping(value = "/insertUser",method = RequestMethod.POST)
    public int inserUser(@RequestBody User user){
        return userService.insert(user);
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }

    @RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
    public int deleteUser(@RequestParam(name="id") Integer id){
        return userService.deleteUser(id);
    }

    @RequestMapping(value = "/getAllUser",method = RequestMethod.POST)
    public JSONObject getAllUser(){
        JSONObject json = new JSONObject();
        List<User> listUser = userService.getAllUser();
        json.put("userList",listUser);
        return json;
    }
}
