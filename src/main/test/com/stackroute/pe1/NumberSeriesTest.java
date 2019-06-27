package com.stackroute.pe1;
import org.junit.*;
import static org.junit.Assert.*;

public class NumberSeriesTest {
    NumberSeries numberseries;
    @Before
    public void setUp(){
        System.out.println("Before");
        numberseries=new NumberSeries();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        numberseries=null;
    }
    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("BeforeClass");
    }
    @AfterClass
    public static void tearDownAfterClass(){
        System.out.println("AfterClass");
    }
    @Test
    public void GivenNumberIsPositiveNumber(){
        //act
        String result=numberseries.numberN(3);

        //assert
        assertEquals("1 2 2 3 3 3",result);
    }
    @Test
    public void GivenNumberIs0(){
        //act
        String result=numberseries.numberN(0);

        //assert
        assertEquals("",result);
    }
    @Test
    public void GivenNumberIsNegative(){
        //act
        String result=numberseries.numberN(-3);

        //assert
        assertEquals("",result);
    }


}