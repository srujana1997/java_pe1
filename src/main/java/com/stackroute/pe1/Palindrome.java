package com.stackroute.pe1;
public class Palindrome {
    public String palindrome(int num) {
        int r, sum = 0, temp = num, even = 0;
        while (num > 0) {
            r = num % 10;//getting remainder
            if (r % 2 == 0)
                even = even + r;
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if (temp == sum) {
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

