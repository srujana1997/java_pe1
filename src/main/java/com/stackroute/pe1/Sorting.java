package com.stackroute.pe1;
public class Sorting{
    public String sort(int number)
    {
        String result="";
        String sortedString;
        String evenNumberSum;
        boolean checkString;
        //for taking negative number
        number=Math.abs(number);
        int temp=number;
        int count=0;
        int sum=0;
        int sortednumber=0;
        //Finding even numbers and adding those
        while(number>0)
        {
            int remainder=number%10;
            count++;
            number=number/10;
            if(remainder%2==0)
                sum=sum+remainder;
        }
        int intArr[]=new int[count];
        for(int i=0;temp>0;i++)
        {
            intArr[i]=temp%10;
            temp=temp/10;
        }
        // bubble sort for sorting the elements
        for(int i=0;i<count;i++)
        {
            for(int j=i;j<count;j++)
            {
                if(intArr[i]<intArr[j])
                {
                    temp=intArr[i];
                    intArr[i]=intArr[j];
                    intArr[j]=temp;
                }
            }
        }
        //printing number after sorting
        for(int i=0;i<count;i++)
        {
            sortednumber=sortednumber*10+intArr[i];
        }
        sortedString = "Sorted number in non-increasing order "+sortednumber;
        evenNumberSum="Sum of even numbers "+sum;
        checkString=(sum>15?true:false);
        //conating the values for getting result
        result = result.concat(sortedString).concat(evenNumberSum).concat(Boolean.toString(checkString));
        return result;
    }
}

