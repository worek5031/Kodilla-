package com.kodilla.spring.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char userSex;
    private final int userPostQuantity;
    private final LocalDate userBirthDate;

       public int getUserPostQuantity() {
        return userPostQuantity;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getUserBirthDate() {
        return userBirthDate;
    }

    public ForumUser(final int userId, final String userName, final char userSex, final int userPostQuantity, LocalDate userBirthDate) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.userPostQuantity = userPostQuantity;
        this.userBirthDate = userBirthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return userId == forumUser.userId &&
                Objects.equals(userName, forumUser.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName);
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", userPostQuantity=" + userPostQuantity +
                '}';
    }
}

