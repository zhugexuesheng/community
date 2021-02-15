package com.gxa.springbootmain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangyujin
 * @version 1.0
 * @description PublishController.java
 * @date 2021/2/15 22:27
 */
@Controller
public class PublishController {
   @GetMapping("/publish")
    public String publish(){
       return "publish";
   }
}
