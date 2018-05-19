package com.kodilla.patterns.singleton;


import com.kodilla.patterns.com.kodilla.patterns.singleton.Logger;
import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog(){
        //Given
        Logger.getLoggerInstance().log("Log check");

        //When
        String lastLog = Logger.getLoggerInstance().getLastLog();

        //Then
        Assert.assertEquals(lastLog, "Log check");
    }


}
