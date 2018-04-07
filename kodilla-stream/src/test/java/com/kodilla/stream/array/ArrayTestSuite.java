package com.kodilla.stream.array;
import org.junit.*;

public class ArrayTestSuite {
    @Test
    public void testArrayOperations(){
        //Given
        int[]numbers = {67, 423, 567, 324, 7864, 45, 673, 734};
        double sum = 0;
        for (int n : numbers) {
            sum+=n;
        }
        double average = sum / numbers.length;
        //When
        double testedResult = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(average, testedResult, 0);
        }
}
