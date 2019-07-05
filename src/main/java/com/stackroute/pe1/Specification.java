package com.stackroute.pe1;
public class Specification {
    public String CheckCharacter(char ch)
    {
        String result = "";
        //ASCII values for lower case letter lies in between 97 and 123
        if(ch >= 97 && ch<= 123){
            result =  "lower case letter";
        }
        //ASCII values for upper case letters lies in between 65 and 96
        else if(ch >= 65 && ch<= 96){
            result = "upper case letter";
        }
        //ASCII values for digits lies  in between 48 and 57
        else if(ch >= 48 && ch<= 57){
            result = "digit";
        }
        else {
            result = "special character";
        }
        return result;
    }

}
