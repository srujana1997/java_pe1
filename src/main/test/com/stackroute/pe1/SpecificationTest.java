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
    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("BeforeClass");
    }
    @AfterClass
    public static void tearDownAfterClass(){
        System.out.println("AfterClass");
    }
    @Test
    public void givenCharacterIsLowerCaseLetter(){
        //act
        String result=specification.CheckCharacter('a');

        //assert
        assertEquals("lower case letter",result);
    }
    @Test
    public void givenCharacterIsUpperCaseLetter(){
        //act
        String result=specification.CheckCharacter('A');

        //assert
        assertEquals("upper case letter",result);
    }
    @Test
    public void givenCharacterIsDigit(){
        //act
        String result=specification.CheckCharacter('8');

        //assert
        assertEquals("digit",result);
    }

    @Test
    public void givenCharacterIsSpecialCharacter(){
        //act
        String result=specification.CheckCharacter('@');

        //assert
        assertEquals("special character",result);
    }


}