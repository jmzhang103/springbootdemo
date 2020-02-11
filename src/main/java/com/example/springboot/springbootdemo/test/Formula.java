package com.example.springboot.springbootdemo.test;

public interface Formula {
    double calculate(int a);
    default double sqrt(int a){
        return Math.sqrt(a);
    }
}
