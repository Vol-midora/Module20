package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args){
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            System.out.println(secondChallenge.probablyIWillThrowException(14, 12));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("Thank you");
        }
    }
}
