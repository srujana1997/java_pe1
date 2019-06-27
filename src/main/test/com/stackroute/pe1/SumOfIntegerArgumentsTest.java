package com.stackroute.pe1;
import org.junit.*;
import static org.junit.Assert.*;
public class SumOfIntegerArgumentsTest {
    SumOfIntegerArguments sumofintegerargs;
    @Before
    public void setUp(){
        System.out.println("Before");
        sumofintegerargs=new SumOfIntegerArguments ();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        sumofintegerargs=null;
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
    public void givenStringShouldReturnIntSum(){
        //act
        String result=sumofintegerargs.getSumOfArguments("1 2 3 4 5");

        //assert
        assertEquals("15",result);
    }
    @Test
    public void givenStringWithoutIntegerShouldReturnErrorMessage(){
        //act
        String result=sumofintegerargs.getSumOfArguments("srujana");

        //assert
        assertEquals("please enter all integers",result);
    }
    @Test
    public void givenStringWithNegativenumberShouldReturnErrorIntSum(){
        //act
        String result=sumofintegerargs.getSumOfArguments("1 2 3 4 -5");

        //assert
        assertEquals("5",result);
    }

}