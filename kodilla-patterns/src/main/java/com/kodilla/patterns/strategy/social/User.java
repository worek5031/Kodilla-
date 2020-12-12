package com.kodilla.patterns.strategy.social;

public class User {

    public String name;
    public SocialPublisher socialPublisher;

    public String publish() {
        return socialPublisher.share();
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

}
