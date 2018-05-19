package com.kodilla.patterns.strategy.social;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserTestSuite {

    @Before
            public void before(){
        System.out.println("");
    }


    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User jessie = new Millenials("Jessie");
        User james = new YGeneration("James");
        User meow = new ZGeneration("Meow");

        //When
        String jessieShare = jessie.sharePost();
        String jamesShare = james.sharePost();
        String meowShare = meow.sharePost();
        System.out.println(jessieShare);
        System.out.println(jamesShare);
        System.out.println(meowShare);

        //Then
        Assert.assertEquals("Jessie Published on Facebook", jessieShare);
        Assert.assertEquals("James Published on Twitter", jamesShare);
        Assert.assertEquals("Meow Published on Snapchat", meowShare);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User meow = new ZGeneration("Meow");
        System.out.println(meow.sharePost());

        //When
        meow.setSocialPublisher(new FacebookPublisher());
        System.out.println(meow.sharePost());

        //Then
        Assert.assertEquals("Meow Published on Facebook", meow.sharePost());


    }

}
