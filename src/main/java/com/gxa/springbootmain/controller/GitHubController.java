package com.gxa.springbootmain.controller;

import com.gxa.springbootmain.dto.AccessToKenDto;
import com.gxa.springbootmain.dto.GitHubUser;
import com.gxa.springbootmain.pojo.YongHuXinXi;
import com.gxa.springbootmain.service.YongHuXinXiService;
import com.gxa.springbootmain.service.impl.YongHuXinXiServiceImpl;
import com.gxa.springbootmain.util.GitHubUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.UUID;

/**
 * @author zhangyujin
 * @version 1.0
 * @description GitHubController.java
 * @date 2021/2/15 14:56
 */
@Controller
public class GitHubController {

    @Resource
    private GitHubUtil gitHubUtil;

    @Resource
    private YongHuXinXiServiceImpl yongHuXinXiServiceImpl;
    @Value("${github.client.id}")
    private String Client_id;
    @Value("${github.client.secret}")
    private String Client_Secret;
    @Value("${github.client.uri}")
    private String Client_Uri;

    @RequestMapping(value = "/callback",method = RequestMethod.GET)
    public String callback(@RequestParam String code, @RequestParam String state, HttpServletRequest request, HttpServletResponse response){
        System.out.println(code+" "+state);
        AccessToKenDto accessToKenDto=new AccessToKenDto();
        accessToKenDto.setCode(code);
        accessToKenDto.setClient_secret(Client_Secret);
        accessToKenDto.setRedirect_uri(Client_Uri);
        accessToKenDto.setClient_id(Client_id);
        accessToKenDto.setState(state);
        String access=gitHubUtil.getAccessToken(accessToKenDto);
        GitHubUser gitHubUser=gitHubUtil.getUser(access);
        System.out.println(gitHubUser.getName());
        if(gitHubUser!=null){
            YongHuXinXi yongHuXinXi=new YongHuXinXi();
            String token=UUID.randomUUID().toString();
            yongHuXinXi.setToken(token);
            yongHuXinXi.setYongHuMing(gitHubUser.getName());
            yongHuXinXi.setDengLuMing(gitHubUser.getId().toString());
            yongHuXinXi.setChuangJianShiJian(new Date(System.currentTimeMillis()));
            yongHuXinXi.setXiuGaiShiJian(yongHuXinXi.getChuangJianShiJian());
            yongHuXinXi.setYongHuTouXiang(gitHubUser.getAvatar_url());
            yongHuXinXiServiceImpl.xinZeng(yongHuXinXi);
            request.getSession().setAttribute("user",gitHubUser);
            response.addCookie(new Cookie("token",token));
            return "redirect:/";
        }else{
            return "redirect:/";
        }
    }
}
