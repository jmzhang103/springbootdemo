package com.example.springboot.springbootdemo.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JackSonUtil {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    public static ObjectMapper getInstance(){
        return objectMapper;
    }
    public static String writeValueAsString(Object obj){
        try {
            return getInstance().writeValueAsString(obj);
        }catch (JsonProcessingException e){
            e.printStackTrace();
        }
        return null;
    }
    public static <T> T readValue(String jsonStr, Class<T> clazz){
        try {
            return getInstance().readValue(jsonStr,clazz);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
