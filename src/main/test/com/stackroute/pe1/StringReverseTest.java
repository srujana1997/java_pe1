package com.stackroute.pe1;
import org.junit.*;

import static org.junit.Assert.*;

public class StringReverseTest {
    StringReverse stringreverse;
    @Before
    public void setUp(){
        System.out.println("Before");
        stringreverse=new StringReverse();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        stringreverse=null;
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
    public void givenStringShouldReturnStringReverse(){
        //act
        String result=stringreverse.stringRev("srujana");

        //assert
        assertEquals("anajurs",result);
    }
    @Test
    public void givenNullShouldReturnErrorMessage(){
        //act
        String result=stringreverse.stringRev(null);

        //assert
        assertEquals("Enter proper string",result);
    }
    @Test
    public void givenEmptyStringShouldReturnEmptyString(){
        //act
        String result=stringreverse.stringRev("");

        //assert
        assertEquals("",result);
    }

}