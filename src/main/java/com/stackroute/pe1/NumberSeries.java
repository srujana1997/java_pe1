package com.stackroute.pe1;
public class NumberSeries {
    public String numberN(int number){
        StringBuffer result= new StringBuffer("");
            for(int i=1;i<=number;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    result.append(i);   //appends next values to results
                }
            }
            return result.toString();   //coverting StringBuffer to Sting
        }
}
