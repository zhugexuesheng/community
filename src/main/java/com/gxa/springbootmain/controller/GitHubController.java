package com.gxa.springbootmain.controller;

import com.gxa.springbootmain.dto.AccessToKenDto;
import com.gxa.springbootmain.dto.GitHubUser;
import com.gxa.springbootmain.util.GitHubUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

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

    @Value("${github.client.id}")
    private String Client_id;
    @Value("${github.client.secret}")
    private String Client_Secret;
    @Value("${github.client.uri}")
    private String Client_Uri;

    @RequestMapping(value = "/callback",method = RequestMethod.GET)
    public String callback(@RequestParam String code,@RequestParam String state){
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
        return "luntanindex";
    }
}
