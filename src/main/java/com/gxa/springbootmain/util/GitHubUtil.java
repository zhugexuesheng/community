package com.gxa.springbootmain.util;

import com.alibaba.fastjson.JSON;
import com.gxa.springbootmain.dto.AccessToKenDto;
import com.gxa.springbootmain.dto.GitHubUser;
import okhttp3.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author zhangyujin
 * @version 1.0
 * @description GitHubUtil.java
 * @date 2021/2/15 15:18
 */
@Component
public class GitHubUtil {
    public String getAccessToken(AccessToKenDto accessToKenDto) {
        MediaType mediaType = MediaType.get("application/json; charset=utf-8");
        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(mediaType, JSON.toJSONString(accessToKenDto));
        Request request = new Request.Builder()
                .url("https://github.com/login/oauth/access_token")
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            String string = response.body().string();
            System.out.println(string);
            String[] spits = string.split("&");
            String tokenstr = spits[0];
            String acess = tokenstr.split("=")[1];
            System.out.println(acess);
            return acess;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public GitHubUser getUser(String accessToken) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url("https://api.github.com/user?access_token=" + accessToken).header("Authorization", "token " + accessToken).build();
        try {
            Response response = client.newCall(request).execute();
            String string = response.body().string();
            GitHubUser githubUser = JSON.parseObject(string, GitHubUser.class);
            return githubUser;
        } catch (Exception e) {
        }
        return null;
    }
}
