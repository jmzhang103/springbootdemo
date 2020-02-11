package com.example.springboot.springbootdemo.controller;

import com.example.springboot.springbootdemo.entity.TbUser;
import com.example.springboot.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/findAll")
    public List<TbUser> findAll(){
        System.out.println("###查询所有用户信息###");
        List<TbUser> users = userService.findAll();
        users.forEach(user ->System.out.println(user.getUsername()));
        return users;
    }
    @RequestMapping("/test")
    public String test(String str){
        System.out.println("###测试所有用户信息###");
        return userService.execute(str);
    }

}
