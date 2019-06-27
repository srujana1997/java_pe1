package com.stackroute.pe1;
public class Specification {
    public String CheckCharacter(char ch)
    {
        if(ch >= 97 && ch<= 123){
            return "lower case letter";
        }
        else if(ch >= 65 && ch<= 96){
            return "upper case letter";
        }
        else if(ch >= 48 && ch<= 57){
            return "digit";
        }
        else
            return "special character";
    }

}
