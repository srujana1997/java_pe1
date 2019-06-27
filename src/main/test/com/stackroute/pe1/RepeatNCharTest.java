package com.stackroute.pe1;
import org.junit.*;

import static org.junit.Assert.*;

public class RepeatNCharTest {
    RepeatNChar repeat;
    @Before
    public void setUp(){
        System.out.println("Before");
        repeat=new RepeatNChar();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        repeat=null;
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
    public void givenStringIsAValidString(){
        //act
        String result=repeat.repeatchar("srujana",4);

        //assert
        assertEquals("srujanajanajanajanajana",result);
    }
    @Test
    public void givenStringIsInValidString(){
        //act
        String result=repeat.repeatchar("0",4);

        //assert
        assertEquals("Enter a valid string",result);
    }
    @Test
    public void givenStringIsNull(){
        //act
        String result=repeat.repeatchar("",4);

        //assert
        assertEquals("Enter a valid string",result);
    }


}