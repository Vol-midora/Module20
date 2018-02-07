package com.kodilla.testing;
import com.kodilla.testing.calculator.*;

public class TestingMain {
    public static void main(String[] args){
        Calculator calc = new Calculator();


        int x = 7;
        int y = 156;
        //to test add method
        if (calc.add(x,y) == x+y) {
            System.out.println("Add method works!");
        } else {
            System.out.println("Add method resulted in error!");
        }

        //to test substract method
        if (calc.substract(x,y) == x-y) {
            System.out.println("Substract method works!");
        } else {
            System.out.println("Substract method resulted in error!");
        }

    }
}