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
    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("BeforeClass");
    }
    @AfterClass
    public static void tearDownAfterClass(){
        System.out.println("AfterClass");
    }
    @Test
    public void givenNumberShouldReturnSortedNumberAndSumBeloeLimit(){
        //act
        Sorting.Variable variable=sorting.sort(234534);
        //assert
        assertEquals("Sorted number in non-interesting order:" +544332,variable.sortedString);
        assertEquals("Sum of even numbers: "+10,variable.evenNumSum);
        assertEquals(false,variable.checkString);
    }
    @Test
    public void givenNumberShouldReturnSortedNumberAndSumAboveLimit(){
        //act
        Sorting.Variable variable=sorting.sort(234534);
        //assert
        assertEquals("Sorted number in non-interesting order:" +544332,variable.sortedString);
        assertEquals("Sum of even numbers: "+20,variable.evenNumSum);
        assertEquals(false,variable.checkString);
    }
    @Test
    public void givenZeroShouldReturnSortedNumberAndSumAboveLimit(){
        //act
        Sorting.Variable variable=sorting.sort(0);
        //assert
        assertEquals("Sorted number in non-interesting order:" +0,variable.sortedString);
        assertEquals("Sum of even numbers: "+0,variable.evenNumSum);
        assertEquals(false,variable.checkString);
    }
    @Test
    public void givenNumberShouldReturnSortedNumberAndSumLowLimit(){
        //act
        Sorting.Variable variable=sorting.sort(234534);
        //assert
        assertEquals("Sorted number in non-interesting order:" +544332,variable.sortedString);
        assertEquals("Sum of even numbers: "+10,variable.evenNumSum);
        assertEquals(false,variable.checkString);
    }

}