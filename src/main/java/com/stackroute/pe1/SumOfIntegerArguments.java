package com.stackroute.pe1;
public class SumOfIntegerArguments {
    public String getSumOfArguments(String numbers)
    {
        int sum=0;
        String[]  arr=numbers.split(" ");
        int[] intarr=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            try{
                intarr[i]=Integer.parseInt(arr[i]);
            }
            catch(Exception e)
            {
                return "please enter all integers";
            }
            sum=sum+intarr[i];
        }
        return sum+"";
    }
}
