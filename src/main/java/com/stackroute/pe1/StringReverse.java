package com.stackroute.pe1;
public class StringReverse {
    public String stringReverse(String word) {
        if(word==null||word==""){
            return "String should not be null or empty";
        }
        StringBuffer result = new StringBuffer(word);
        result.reverse();
        //coverting StringBuffer to String
        return result.toString();
    }
}
