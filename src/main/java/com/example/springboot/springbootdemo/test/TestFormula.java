package com.example.springboot.springbootdemo.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestFormula<names> implements Formula {

    @Override
    public double calculate(int a) {
        return a+10;
    }

    public static void main(String[] args) {
      /*  TestFormula tf = new TestFormula();
        double d1 = tf.calculate(2);
        double d2 = tf.sqrt(9);
        System.out.println(d1);
        System.out.println(d2);*/

        List<String> names = Arrays.asList("peter","anna","mike","xiena","anhui","kevin","tom","jim","kobe","harden");
        //Collections.sort(names, Comparator.reverseOrder());
        //names.sort((a,b) -> a.compareTo(b));
        /*names.sort(Comparator.naturalOrder());
        System.out.println(names);
        String s = "www.runoob.com";
        char result = s.charAt(2);
        System.out.println(result);
        names.forEach(name ->{if(name.startsWith("a")){
        System.out.println(name);}}
        );*/
        long a1 = System.currentTimeMillis();
        for(int i=0;i<names.size();i++){
            doSomeThing();
        }
        long a2 = System.currentTimeMillis();
        System.out.println("普通for循环耗时:"+(a2-a1));
        long b1 = System.currentTimeMillis();
        for(String name : names){
            doSomeThing();
        }
        long b2 = System.currentTimeMillis();
        System.out.println("增强for循环:"+(b2-b1));
        long c1 = System.currentTimeMillis();
        names.forEach((t)->doSomeThing());
        long c2 = System.currentTimeMillis();
        System.out.println("foreach循环耗时:"+(c2-c1));
        long d1 = System.currentTimeMillis();
        names.stream().forEach((t)->doSomeThing());
        long d2 = System.currentTimeMillis();
        System.out.println("串行stream循环耗时:"+(d2-d1));
        long e1 = System.currentTimeMillis();
        names.parallelStream().forEach((t)->doSomeThing());
        long e2 = System.currentTimeMillis();
        System.out.println("并行stream循环耗时:"+(e2-e1));

        names.parallelStream().sorted().forEach(System.out::println);


    }

        private static void doSomeThing() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
}
