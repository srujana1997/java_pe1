package com.stackroute.pe1;
import org.junit.*;
import static org.junit.Assert.*;

public class OddevenTest {
    Oddeven oddeven;
    @Before
    public void setUp(){
        System.out.println("Before");
        oddeven=new Oddeven();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        oddeven=null;
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
    public void givenNumberIsEvenAndItIsInBetween20And30(){
        //act
        String result=oddeven.checking(24);

        //assert
        assertEquals("Jerry",result);
    }
    @Test
    public void givenNumberIsOddAndItIsInBetween20And30(){
        //act
        String result=oddeven.checking(23);

        //assert
        assertEquals("Tom",result);
    }
    @Test
    public void givenNumberIsNotBetween20And30(){
        //act
        String result=oddeven.checking(44);

        //assert
        assertEquals(null,result);
    }
}