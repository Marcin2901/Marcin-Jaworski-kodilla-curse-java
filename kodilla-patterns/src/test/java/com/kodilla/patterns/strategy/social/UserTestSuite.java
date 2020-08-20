package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.SnapchatPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Give
        User facebookUser = new Milenials("John");
        User snapchatUser = new YGeneration("Anna");
        User twitterUser = new ZGeneration("Mark");

        //When
        String facebookUserShare = facebookUser.sharePost();
        System.out.println("John share with - " + facebookUserShare);
        String snapchatUserShare = snapchatUser.sharePost();
        System.out.println("Anna share with - " + snapchatUserShare);
        String twitterUserShare = twitterUser.sharePost();
        System.out.println("Mark share with - " + twitterUserShare);

        //Then
        Assert.assertEquals("Using: Facebook",facebookUserShare);
        Assert.assertEquals("Using: Snapchat",snapchatUserShare);
        Assert.assertEquals("Using: Twitter",twitterUserShare);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Give
        User facebookUser = new Milenials("John");

        //When
        String johnShare = facebookUser.sharePost();
        System.out.println("John shared with - " + johnShare);
        facebookUser.setShareStrategy(new SnapchatPublisher());
        johnShare = facebookUser.sharePost();
        System.out.println("Now John sare with - " + johnShare);

        //Then
        Assert.assertEquals("Using: Snapchat", johnShare);

    }
}
