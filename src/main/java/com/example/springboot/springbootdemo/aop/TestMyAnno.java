package com.example.springboot.springbootdemo.aop;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TestMyAnno {
    String value() default "";
}
