package com.stackroute.pe1;
public class vowelconsonant{
    public String checkvowelorconsonant(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                result += "Vowel";
            } else if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
                result += "Consonant";
            }
        }
        return result.trim();
    }
}
