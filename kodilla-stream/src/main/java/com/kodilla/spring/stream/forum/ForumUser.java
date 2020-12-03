package com.kodilla.spring.stream.forum;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public final class ForumUser {
    private final String username;
    private final String realname;
    private final String location;
    private final Set<ForumUser> friends = new HashSet<>();

    public ForumUser(final String username, final String realname, final String location) {
        this.username = username;
        this.realname = realname;
        this.location = location;
    }
    public void addFriend(ForumUser user) {
        friends.add(user);
    }

    public boolean removeFriend(ForumUser user) {
        return friends.remove(user);
    }

    public String getUsername() {
        return username;
    }

    public String getRealname() {
        return realname;
    }

    public String getLocation() {
        return location;
    }

    public Set<ForumUser> getFriends() {
        return friends;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return Objects.equals(username, forumUser.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "username='" + username + '\'' +
                ", realname='" + realname + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
    public Set<String> getLocationsOfFriends() {
        return friends.stream()
                .map(ForumUser::getLocation)
                .collect(Collectors.toSet());
    }
    public Set<String> getLocationsOfFriendsOfFriends() {
        return friends.stream()
                .flatMap(user -> user.getFriends().stream())
                .filter(user -> user != this)
                .map(ForumUser::getLocation)
                .collect(Collectors.toSet());
    }

}
