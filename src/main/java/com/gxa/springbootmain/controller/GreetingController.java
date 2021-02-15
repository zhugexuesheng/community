package com.gxa.springbootmain.controller;

/**
 * @author zhangyujin
 * @version 1.0
 * @description GreetingController.java
 * @date 2021/2/15 10:21
 */
import com.gxa.springbootmain.pojo.YongHuXinXi;
import com.gxa.springbootmain.service.impl.YongHuXinXiServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Controller
public class GreetingController {

    @Resource
    private YongHuXinXiServiceImpl yongHuXinXiServiceImpl;
    @GetMapping("/")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="Worlds") String name, Model model, HttpServletRequest request) {
        Cookie[] cookies=request.getCookies();
        for (Cookie cookie:cookies) {
            if(cookie.getName().equals("token")){
                String token=cookie.getValue();
                YongHuXinXi yongHuXinXi=yongHuXinXiServiceImpl.chaXunByToken(token);
                System.out.println(yongHuXinXi);
                if(yongHuXinXi!=null){
                    request.getSession().setAttribute("user",yongHuXinXi);
                }
                else{
                    request.getSession().setAttribute("user",null);
                }
                break;
            }
        }
        model.addAttribute("name", name);
        return "luntanindex";
    }

}
