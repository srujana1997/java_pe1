package com.stackroute.pe1;
public class RepeatNChar {
    public String repeatchar(String word, int number) {
        try {
            //initialing length to wrod length
            int length = word.length();
            String result = word;
            for (int i = 0; i < number; i++) {
                result = result.concat(word.substring(length - number, length));    //concatinating result with substring
            }
            return result;
        }
        catch (Exception exeception) {
            return "Enter a valid string";
    }
    }
}