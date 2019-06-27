package com.stackroute.pe1;
import org.junit.*;

import static org.junit.Assert.*;

public class GuessTheRandomNumberTest {
    GuessTheRandomNumber guessTheRandomNumber;
    @Before
    public void setUp(){
        System.out.println("Before");
        guessTheRandomNumber=new GuessTheRandomNumber();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        guessTheRandomNumber=null;
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
    public void guessedNumberIsMoreThanGivenNumber(){
        //act
        String result=guessTheRandomNumber.playguessingGame(6,1);

        //assert
        assertEquals("Number guessed number is less than the original number",result);
    }
    @Test
    public void guessedNumberIsLessThanGivenNumber(){
        //act
        String result=guessTheRandomNumber.playguessingGame(6,16);

        //assert
        assertEquals("Number guessed number is more than the original number",result);
    }
    @Test
    public void guessedNumberMatchesGivenNumber(){
        //act
        String result=guessTheRandomNumber.playguessingGame(16,16);

        //assert
        assertEquals("Number guessed matches the original number",result);
    }


}