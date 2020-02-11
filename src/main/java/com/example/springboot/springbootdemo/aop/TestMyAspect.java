package com.example.springboot.springbootdemo.aop;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.springboot.springbootdemo.common.JackSonUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@Aspect
public class TestMyAspect {
    @Pointcut("@annotation(com.example.springboot.springbootdemo.aop.TestMyAnno)")
    public void myAspect(){};
    @Around("myAspect()")
    public Object showMonitorMsg(ProceedingJoinPoint joinPoint){
        Object result = null;
        try{
            Object[] objs = joinPoint.getArgs();
            String params = JackSonUtil.writeValueAsString(objs);
            String executeMethod = getTestAnnoDesc(joinPoint);
            result = joinPoint.proceed();
            System.out.println("###拦截器执行###");
            System.out.println("拦截执行参数："+params);
            System.out.println("拦截执行方法："+executeMethod);
        } catch (Throwable e){
            e.printStackTrace();
        }
        System.out.println("拦截结果："+result);
        return result;
    }
    public String getTestAnnoDesc(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        TestMyAnno testMyAnno = method.getAnnotation(TestMyAnno.class);
        return testMyAnno.value();

    }
}
