package com.stackroute.pe1;
import org.junit.*;
import static org.junit.Assert.*;
public class vowelconsonantTest {
    vowelconsonant vowelcons;
    @Before
    public void setUp(){
        System.out.println("Before");
        vowelcons=new vowelconsonant();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        vowelcons=null;
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
    public void givenStringShouldReturnConsonant(){
        //act
        String result=vowelcons.checkvowelorconsonant("p");

        //assert
        assertEquals("Consonant",result);
    }
    @Test
    public void givenStringShouldReturnSpecifications(){
        //act
        String result=vowelcons.checkvowelorconsonant("ap");

        //assert
        assertEquals("Vowel Consonant",result);
    }
    @Test
    public void givenStringShouldReturnNullForSpecifications(){
        //act
        String result=vowelcons.checkvowelorconsonant("a@p");

        //assert
        assertEquals("Vowel Consonant",result);
    }
}