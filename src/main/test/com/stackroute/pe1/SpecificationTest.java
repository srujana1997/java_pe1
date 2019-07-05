package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class SpecificationTest {
    Specification specification;
    @Before
    public void setUp(){
        System.out.println("Before");
        specification=new Specification();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        specification=null;
    }
    @Test
    public void givenCharacterShouldBeALowerCaseLetter(){
        //act
        String result=specification.CheckCharacter('a');

        //assert
        assertEquals("lower case letter",result);
    }
    @Test
    public void givenCharacterShouldBeAUpperCaseLetter(){
        //act
        String result=specification.CheckCharacter('A');

        //assert
        assertEquals("upper case letter",result);
    }
    @Test
    public void givenCharacterShouldBeADigit(){
        //act
        String result=specification.CheckCharacter('8');

        //assert
        assertEquals("digit",result);
    }
    @Test
    public void givenCharacterShouldBeASpecialCharacter(){
        //act
        String result=specification.CheckCharacter('@');

        //assert
        assertEquals("special character",result);
    }
    @Test
    public void givenCharacterShouldNotBeASpecialCharacter(){
        //act
        String result=specification.CheckCharacter('A');

        //assert
        assertNotEquals("special character",result);
    }
}