package com.stackroute.pe1;
public class Oddeven {
    public String checking(int num) {
        if (num > 20 && num < 30) {
            if (num % 2 == 0) {
                return "Jerry";
            } else {
                return "Tom";
            }
        }
        return null;
    }
}
