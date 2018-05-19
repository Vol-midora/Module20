package com.kodilla.patterns.strategy.social;

public class User {
    private String username;
    protected SocialPublisher socialPublisher;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    public String sharePost(){
        return this.username + " " + this.socialPublisher.share();
    }
}
