package com.kodilla.testing.collection;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        ArrayList<Integer> testArray = new ArrayList<>();
        OddNumbersExterminator testedObject = new OddNumbersExterminator();
        ArrayList<Integer> resultArray = testedObject.exterminate(testArray);
        System.out.println("Now testing empty array");
        Assert.assertTrue(resultArray.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        ArrayList<Integer> testArray = new ArrayList<>();
        for(int i = 0; i<100; i++){
            testArray.add(i);
        }
        ArrayList<Integer> expectedArray = new ArrayList<>();
        for(int i = 0; i<100; i=i+2){
            expectedArray.add(i);
        }
        OddNumbersExterminator testedObject = new OddNumbersExterminator();
        ArrayList<Integer> resultArray = testedObject.exterminate(testArray);
        System.out.println("Now testing regular array");
        Assert.assertEquals(expectedArray, resultArray);
    }

}
