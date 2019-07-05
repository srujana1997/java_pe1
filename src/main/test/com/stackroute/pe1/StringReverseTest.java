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

    @Test
    public void givenStringShouldReturnStringReverse(){
        //act
        String result=stringreverse.stringReverse("srujana");

        //assert
        assertEquals("anajurs",result);
    }
    @Test
    public void givenStringShouldNotReturnStringReverse(){
        //act
        String result=stringreverse.stringReverse("srujana");

        //assert
        assertNotEquals("bnajurs",result);
    }
    @Test
    public void givenStringNUllShouldReturnErrorMessage(){
        //act
        String result=stringreverse.stringReverse(null);

        //assert
        assertEquals("String should not be null or empty",result);
    }
    @Test
    public void givenEmptyStringShouldReturnErrorString(){
        //act
        String result=stringreverse.stringReverse("");

        //assert
        assertEquals("String should not be null or empty",result);
    }

}