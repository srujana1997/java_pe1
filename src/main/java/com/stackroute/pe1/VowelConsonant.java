package com.stackroute.pe1;
public class VowelConsonant {
    public String checkVowelOrConsonant(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            //taking individul character
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                result = result.concat("vowel ");
            } else if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
                result = result.concat("Consonant ");
            }
            else{
                result = "Enter Alphabets only";
            }
        }
        return result.trim();
    }
}
