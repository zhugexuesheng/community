package com.gxa.springbootmain.dto;

/**
 * @author zhangyujin
 * @version 1.0
 * @description GitHubUser.java
 * @date 2021/2/15 16:01
 */
public class GitHubUser {
    private  String name;
    private Long id;
    private String bio;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
