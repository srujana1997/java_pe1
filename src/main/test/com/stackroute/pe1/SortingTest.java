package com.stackroute.pe1;
import org.junit.*;

import static org.junit.Assert.*;

public class SortingTest {
    Sorting sorting;
    @Before
    public void setUp(){
        System.out.println("Before");
        sorting=new Sorting();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        sorting=null;
    }
    @Test
    public void givenNumberShouldReturnSortedNumberAndSumShouldBeLessthan15(){
        //act
        String result=sorting.sort(234534);
        //assert
        assertEquals("Sorted number in non-increasing order " +544332+"Sum of even numbers "+10+"false",result);
    }
    @Test
    public void givenNumberShouldReturnSortedNumberAndSumShouldBeGreaterThan15(){
        //act
        String result=sorting.sort(264534);
        //assert
        assertEquals("Sorted number in non-increasing order " +654432+"Sum of even numbers "+16+"true",result);
    }
    @Test
    public void givenNegativeNumberShouldReturnSortedNumberAndSumShouldBeLessthan15(){
        //act
        String result=sorting.sort(-234534);
        //assert
        assertEquals("Sorted number in non-increasing order " +544332+"Sum of even numbers "+10+"false",result);
    }
    @Test
    public void givenNegativeNumberShouldNotReturnSortedNumberAndSumShouldBeLessthan15(){
        //act
        String result=sorting.sort(-234534);
        //assert
        assertNotEquals("Sorted number in non-increasing order " +-544332+"Sum of even numbers "+10+"false",result);
    }


}