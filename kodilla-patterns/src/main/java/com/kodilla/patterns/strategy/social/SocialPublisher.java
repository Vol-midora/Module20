package com.kodilla.patterns.strategy.social;

public interface SocialPublisher {
    String FACEBOOK = "Published on Facebook";
    String TWITTER = "Published on Twitter";
    String SNAPCHAT = "Published on Snapchat";
    public String share();
}
