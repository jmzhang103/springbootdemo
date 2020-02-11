package com.example.springboot.springbootdemo.proxy;


import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

public class ProxyTest {
    static ProxyTest pt = new ProxyTest();
    static{
        System.out.println("执行static静态块");
    }
    {
        System.out.println("执行了构造块");
    }
    public static void main(String[] args) {
        ProxyTest proxyTest = new ProxyTest();
        final Computer computer = new Computer();
        SaleComputer proxy = (SaleComputer) Proxy.newProxyInstance(computer.getClass().getClassLoader(), computer.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                if(method.getName().equals("sale")){
                    Double money = (Double)objects[0];
                    money = money*0.8;
                    System.out.println("专车接送");
                    String s = (String)method.invoke(computer,money);
                    System.out.println("免费送货");
                    return s+"和一个鼠标";
                }else{
                    Object obj = method.invoke(computer,objects);
                    return obj;
                }
            }
        });
        String saleResult = proxy.sale(5000);
        System.out.println("代理后结果: "+saleResult);
    }
}
