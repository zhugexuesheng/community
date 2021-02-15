package com.gxa.springbootmain.myexception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangyujin
 * @version 1.0
 * @description MyException.java
 * @date 2021/1/27 16:09
 */
@ControllerAdvice
public class MyException {

    @ExceptionHandler
    @ResponseBody
    public Map<String,Object> getException(Throwable e){
        Map<String,Object> map=new HashMap<>();
        e.printStackTrace();
        map.put("code", 500);
        map.put("msg", e.getMessage());
        return map;
    }
}
