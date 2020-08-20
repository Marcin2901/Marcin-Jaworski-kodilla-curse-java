package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.FacebookPublisher;

public class Milenials extends User {
    public Milenials(String username) {
        super(username);
        this.socialPublisher = new FacebookPublisher();
    }
}
