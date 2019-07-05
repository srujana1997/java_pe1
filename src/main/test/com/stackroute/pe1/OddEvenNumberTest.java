package com.stackroute.pe1;
import org.junit.*;
import static org.junit.Assert.*;

public class OddEvenNumberTest {
    OddEvenNumber oddevennumber;
    @Before
    public void setUp(){
        System.out.println("Before");
        oddevennumber=new OddEvenNumber();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        oddevennumber=null;
    }
    @Test
    public void givenNumberIsEvenAndItIsInBetween20And30(){
        //act
        String result=oddevennumber.checking(24);

        //assert
        assertEquals("Jerry",result);
    }
    @Test
    public void givenNumberIsOddAndItIsInBetween20And30(){
        //act
        String result=oddevennumber.checking(23);

        //assert
        assertEquals("Tom",result);
    }
    @Test
    public void givenNumberIsNotBetween20And30(){
        //act
        String result=oddevennumber.checking(44);

        //assert
        assertEquals(null,result);
    }
}