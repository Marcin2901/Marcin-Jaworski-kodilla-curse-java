package com.kodilla.exception.test;

import sun.reflect.annotation.ExceptionProxy;

public class SecondChallenge {
    public String probablyWillTgrowException(double x, double y) throws Exception {
        if(x>=2 || x<1 || y==1.5) {
            throw new Exception();
        }
        return "Done";
    }
}
