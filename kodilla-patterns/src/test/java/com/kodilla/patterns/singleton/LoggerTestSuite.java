package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog(){
        //Give
        // Logger logger = new Logger();
        //When
        Logger.getInstance().log("example");
        // logger.log("example");
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("example",result);

    }
}
