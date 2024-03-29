package com.stackroute.pe1;

import org.junit.*;
import static org.junit.Assert.*;

public class PalindromeTest {
Palindrome palindrome;
    @Before
    public void setUp(){
        System.out.println("Before");
        palindrome=new Palindrome();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        palindrome=null;
    }
    @Test
    public void givenNumberShouldBeAPalindromeAndSumOfEvenNumbersIsGreaterThan25(){
        //act
        String result=palindrome.palindrome(24688642);

        //assert
        assertEquals("palindrome and the sum of even numbers is greater than 25",result);
    }
    @Test
    public void givenNumberShouldBeAPalindromeAndSumOfEvenNumbersIsLessThan25(){
        //act
        String result=palindrome.palindrome(246642);

        //assert
        assertEquals("palindrome and the sum of even numbers is less than 25",result);
    }
    @Test
    public void givenNumberShouldNotBeAPalindrome(){
        //act
        String result=palindrome.palindrome(24678642);

        //assert
        assertEquals("not palindrome",result);
    }

}