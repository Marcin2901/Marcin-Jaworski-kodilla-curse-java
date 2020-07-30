package com.kodilla.exception.test;

public class FirstChallenge {
    public double dibide(double a, double b) throws ArithmeticException{
      if(b==0){
          throw new ArithmeticException();
      }
      return a /b;
    }

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();

       try {
          double  result = firstChallenge.dibide(3, 0);
           System.out.println(result);
       }
       catch (ArithmeticException e){
           System.out.println("EXCEPTION: " + e);
       }


    }
}
