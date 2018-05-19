package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {

    @Test
    public void testBigMacBuilder() {
        //Given
        BigMac.BigMacBuilder bigMacBuilder = new BigMac.BigMacBuilder();
        BigMac bigMac = bigMacBuilder
                .roll("standard")
                .sauce("1000 islands")
                .burgersNumber(3)
                .addIngredient("salad")
                .addIngredient("shrimps")
                .addIngredient("bacon")
                .build();

        //When & Then
        System.out.println(bigMac.toString());
        Assert.assertEquals("standard", bigMac.getRoll());
        Assert.assertEquals("1000 islands", bigMac.getSauce());
        Assert.assertEquals(3, bigMac.getBurgers());
        Assert.assertEquals(3, bigMac.getIngredients().size());
    }
}
