package com.stackroute.pe1;
public class Palindrome {
    public String palindrome(int number) {
        int remainder, sum = 0, temp = number, even = 0;
        while (number > 0) {
            remainder = number % 10;    //getting remainder
            if (remainder % 2 == 0)     //condition for even number
                even = even + remainder;
            sum = (sum * 10) + remainder;
            number = number / 10;
        }
        if (temp == sum) {  //checking given number is palindrome or not
            if (even > 25) {
                return "palindrome and the sum of even numbers is greater than 25";
            } else {
                return "palindrome and the sum of even numbers is less than 25";
            }
        }
        else{
                return "not palindrome";
            }
        }
    }

