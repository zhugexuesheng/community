package com.gxa.springbootmain;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangyujin
 * @version 1.0
 * @description sringbootmain.java
 * @date 2021/1/27 9:58
 */
@Controller
@SpringBootApplication
@MapperScan("com.gxa.springbootmain.mapper")
public class Springbootmain {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Springbootmain.class, args);
    }

}
