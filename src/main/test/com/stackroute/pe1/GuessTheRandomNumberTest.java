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

    @Test
    public void guessedNumberShouldBeMoreThanTheGivenNumber(){
        //act
        String result=guessTheRandomNumber.playguessingGame(6,1);

        //assert
        assertEquals("Number guessed number is more than the original number",result);
    }
    @Test
    public void guessedNumberShouldBeLessThanTheGivenNumber(){
        //act
        String result=guessTheRandomNumber.playguessingGame(6,16);

        //assert
        assertEquals("Number guessed number is less than the original number",result);
    }
    @Test
    public void guessedNumberShoudMatcheWithGivenNumber(){
        //act
        String result=guessTheRandomNumber.playguessingGame(16,16);

        //assert
        assertEquals("Number guessed matches the original number",result);
    }
    @Test
    public void guessedNumberShoudNotMatcheWithGivenNumber(){
        //act
        String result=guessTheRandomNumber.playguessingGame(16,17);

        //assert
        assertNotEquals("Number guessed matches the original number",result);
    }
}