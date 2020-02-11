package com.example.springboot.springbootdemo.aop;

import org.springframework.stereotype.Service;

@Service
public class TestExecute {
    @TestMyAnno("execute")
    public String execute(String str1, String str2){
        return "execute success!";
    }
}
