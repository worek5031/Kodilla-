package com.kodilla.spring.stream.immutable;

public final class ForumUser {
    private final String userName;
    private final String realName;

    public ForumUser(final String userName, final String realName) {
        this.userName = userName;
        this.realName = realName;
    }

    public String getUserName() {
        return this.userName;
    }
    public String getRealName() {
        return this.realName;
    }

}
