package com.example.springboot.springbootdemo.service;

import com.example.springboot.springbootdemo.aop.TestMyAnno;
import com.example.springboot.springbootdemo.entity.TbUser;
import com.example.springboot.springbootdemo.mapper.TbUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private TbUserMapper userMapper;

    public List<TbUser> findAll(){
        return userMapper.selectByExample(null);
    }

    public String test(){
        return "this is a test";
    }

    @TestMyAnno("测试执行")
    public String execute(String str){
        System.out.println("传入参数为："+str);
        return "execute successfully";
    }
}
