package com.kodilla.spring.testing.user;

public class SimpleUser {
    private String username;
    private String realName;

    public SimpleUser(String username)
    {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public SimpleUser(String username, String realName) {
        this.username = username;
        this.realName = realName;
    }

    public String getRealName() {
        return this.realName;
    }
}
