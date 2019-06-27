package com.stackroute.pe1;
public class RepeatNChar {
    public String repeatchar(String word, int number) {
        try {
            int length = word.length();
            String result = word;
            for (int i = 0; i < number; i++) {
                result = result + word.substring(length - number, length);
            }
            return result;
        }
        catch (Exception exeception) {
            return "Enter a valid string";
    }
    }
}