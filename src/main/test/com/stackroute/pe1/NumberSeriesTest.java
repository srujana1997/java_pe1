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
    @Test
    public void GivenNumberShouldBePositiveNumber(){
        //act
        String result=numberseries.numberN(3);

        //assert
        assertEquals("122333",result);
    }
    @Test
    public void GivenNumberShouldBe0(){
        //act
        String result=numberseries.numberN(0);

        //assert
        assertEquals("",result);
    }
    @Test
    public void GivenNumberShouldBENegativeNumber(){
        //act
        String result=numberseries.numberN(-3);

        //assert
        assertEquals("",result);
    }
    @Test
    public void GivenNumberShouldNotBe0(){
        //act
        String result=numberseries.numberN(1);

        //assert
        assertNotEquals("0",result);
    }


}