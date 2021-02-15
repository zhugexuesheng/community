package com.gxa.springbootmain.controller;

/**
 * @author zhangyujin
 * @version 1.0
 * @description GreetingController.java
 * @date 2021/2/15 10:21
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    @GetMapping("/")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="Worlds") String name, Model model) {
        model.addAttribute("name", name);
        return "luntanindex";
    }

}
