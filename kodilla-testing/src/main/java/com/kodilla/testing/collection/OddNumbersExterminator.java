package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> output = new ArrayList<Integer>();
        for(Integer i:numbers){
            if(i%2==0){
                output.add(i);
            }
        }
        return output;
    }
}
