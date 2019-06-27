package com.stackroute.pe1;
public class NumberSeries {
    public String numberN(int num){
        String result="";
            for(int i=1;i<=num;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    result += " "+ i;
                }
            }
            return result.trim();
        }
}
