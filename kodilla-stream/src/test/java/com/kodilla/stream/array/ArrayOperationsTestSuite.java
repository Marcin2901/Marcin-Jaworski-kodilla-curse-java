package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] numbers = {2,3,4,5,6,7};

        //When
        double result = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(4.5,result,0.001);
    }
}
