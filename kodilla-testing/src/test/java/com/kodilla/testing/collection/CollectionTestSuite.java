package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void beforeTest(){
        System.out.println("Test begin");
    }
    @After
    public void afterTest(){
        System.out.println("Test ended");
    }


  @Test
    public void testOddNumbersExterminatorNormalList(){
      ArrayList<Integer> lista  = new ArrayList<>();
      lista.add(1);
      lista.add(2);
      lista.add(3);
      lista.add(4);
        OddNumbersExterminator oddNumbers = new OddNumbersExterminator(lista);

      ArrayList<Integer> lista1  = new ArrayList<>();
       lista= oddNumbers.exterminate(oddNumbers.numbers);
      lista1.add(2);
      lista1.add(4);
        Assert.assertEquals(lista, lista1 );
  }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        ArrayList<Integer> lista  = new ArrayList<>();

        OddNumbersExterminator oddNumbers = new OddNumbersExterminator(lista);

        ArrayList<Integer> lista1  = new ArrayList<>();
        lista= oddNumbers.exterminate(oddNumbers.numbers);

        Assert.assertEquals(lista, lista1 );
    }
}
