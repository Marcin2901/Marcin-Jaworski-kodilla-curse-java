package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    public static double getAverage(int[] numbers){
        IntStream.range(0,numbers.length)
                .forEach(n -> System.out.println(numbers[n]));


      return   IntStream.range(0, numbers.length)
                //.map(n -> numbers[n])
                .map(n -> n = numbers[n])
                .average().getAsDouble();

    }
}
