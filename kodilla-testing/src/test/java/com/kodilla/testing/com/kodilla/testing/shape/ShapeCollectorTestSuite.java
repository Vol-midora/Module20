package com.kodilla.testing.com.kodilla.testing.shape;
import com.kodilla.testing.shape.*;
import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure(){
        //Given
        Triangle thisTriangle = new Triangle(2,4);
        ShapeCollector scollector = new ShapeCollector();

        //When
        scollector.addFigure(thisTriangle);

        //Then
        Assert.assertEquals(1, scollector.shapeList.size());
    }

    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector scollector = new ShapeCollector();
        Triangle thisTriangle = new Triangle(2,4);
        scollector.shapeList.add(thisTriangle);
        int sizebeforeRemoving = scollector.shapeList.size();
        //When
        scollector.removeFigure(thisTriangle);
        //Then
        int sizeAfterRemoving = scollector.shapeList.size();
        Assert.assertEquals(1, sizebeforeRemoving-sizeAfterRemoving);
        }

    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector scollector = new ShapeCollector();
        Triangle thisTriangle = new Triangle(2,4);

        for(int i = 0; i<6;i++){
            scollector.addFigure(new Circle(i+2));
        }
        scollector.shapeList.add(thisTriangle);
        //When
        scollector.getFigure(6);
        //Then
        Assert.assertEquals(thisTriangle, scollector.shapeList.get(6));
    }

    @Test
    public void testShowFigures(){
        //Given
        ShapeCollector scollector = new ShapeCollector();
        Triangle thisTriangle = new Triangle(2,4);
        Circle thisCircle = new Circle(5);
        Square thisSquare = new Square(4);
        scollector.addFigure(thisCircle);
        scollector.addFigure(thisTriangle);
        scollector.addFigure(thisSquare);
        //When
        String tested = scollector.showFigures();
        String expected = "Circle Triangle Square ";
        //Then
        Assert.assertEquals(expected, tested);
    }
}
