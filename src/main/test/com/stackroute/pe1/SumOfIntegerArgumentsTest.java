package com.stackroute.pe1;
import org.junit.*;
import static org.junit.Assert.*;
public class SumOfIntegerArgumentsTest {
    SumOfIntegerArguments sumofintegerarguments;
    @Before
    public void setUp(){
        System.out.println("Before");
        sumofintegerarguments=new SumOfIntegerArguments ();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        sumofintegerarguments=null;
    }

    @Test
    public void givenStringShouldReturnIntSum(){
        //act
        String result=sumofintegerarguments.getSumOfArguments("1 2 3 4 5");

        //assert
        assertEquals("15",result);
    }
    @Test
    public void givenStringWithoutIntegerShouldReturnErrorMessage(){
        //act
        String result=sumofintegerarguments.getSumOfArguments("srujana");

        //assert
        assertEquals("please enter all integers",result);
    }
    @Test
    public void givenStringWithNegativenumberShouldReturnErrorIntSum(){
        //act
        String result=sumofintegerarguments.getSumOfArguments("1 2 3 4 -5");

        //assert
        assertEquals("5",result);
    }

}