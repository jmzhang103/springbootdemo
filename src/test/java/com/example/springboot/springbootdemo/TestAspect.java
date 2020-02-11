package com.example.springboot.springbootdemo;

import com.example.springboot.springbootdemo.aop.TestExecute;
import com.example.springboot.springbootdemo.common.SpringContextUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootdemoApplication.class)
public class TestAspect {
    @Test
    public void test(){
        TestExecute testExecute = SpringContextUtil.getBean(TestExecute.class);
        testExecute.execute("123","456");
    }
    @Autowired
    public TestExecute tExecute;
    @Test
    public void testAuto(){
        tExecute.execute("abc","efg");
    }
}
