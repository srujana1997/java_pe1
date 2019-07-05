package com.stackroute.pe1;
public class OddEvenNumber {
    public String checking(int number) {
        //checking range for given number
        if (number > 20 && number < 30) {
            //condition for even number
            if (number % 2 == 0) {
                return "Jerry";
            } else {
                return "Tom";
            }
        }
        return null;
    }
}
