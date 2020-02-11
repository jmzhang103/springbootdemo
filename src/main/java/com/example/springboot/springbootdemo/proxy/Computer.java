package com.example.springboot.springbootdemo.proxy;

public class Computer implements SaleComputer {
    @Override
    public String sale(double money) {
        System.out.println("花了"+money+"买了一台电脑");
        return "一台电脑";
    }

    @Override
    public void show() {
        System.out.println("展示电脑");
    }
}
