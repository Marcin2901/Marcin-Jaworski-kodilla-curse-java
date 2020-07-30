package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyWillTgrowException(2.1, 3.2);
        }
        catch (Exception e){
            System.out.println("EXCEPTION: " + e);
        }
        finally{
            System.out.println("Program ended");
        }

        }



}
