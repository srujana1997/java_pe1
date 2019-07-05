package com.stackroute.pe1;
import org.junit.*;
import static org.junit.Assert.*;
public class VowelConsonantTest {
    VowelConsonant vowelconsonant;
    @Before
    public void setUp(){
        System.out.println("Before");
        vowelconsonant=new VowelConsonant();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        vowelconsonant=null;
    }
    @Test
    public void givenStringShouldReturnConsonant(){
        //act
        String result=vowelconsonant.checkVowelOrConsonant("p");

        //assert
        assertEquals("Consonant",result);
    }
    @Test
    public void givenStringShouldReturnSpecifications(){
        //act
        String result=vowelconsonant.checkVowelOrConsonant("ap");

        //assert
        assertEquals("vowel Consonant",result);
    }
    @Test
    public void givenStringShouldReturnNullForSpecifications(){
        //act
        String result=vowelconsonant.checkVowelOrConsonant("pa");

        //assert
        assertEquals("Consonant vowel",result);
    }
    @Test
    public void givenStringShouldNotContainAlphabets(){
        //act
        String result=vowelconsonant.checkVowelOrConsonant("123");

        //assert
        assertEquals("Enter Alphabets only",result);
    }

}