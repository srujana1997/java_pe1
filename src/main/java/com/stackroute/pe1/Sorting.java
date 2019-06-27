package com.stackroute.pe1;
public class Sorting{
    public class Variable{
        String sortedString;
        String evenNumSum;
        boolean checkString;

    }
    public Variable sort(int num)
    {
        Variable variable = new Variable();
        num=Math.abs(num);
        int temp=num;
        int count=0;
        int sum=0;
        int sortednum=0;
        while(num>0)
        {
            int rem=num%10;
            count++;
            num=num/10;
            if(rem%2==0)
                sum=sum+rem;
        }
        int intArr[]=new int[count];
        for(int i=0;temp>0;i++)
        {
            intArr[i]=temp%10;
            temp=temp/10;
        }
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
        for(int i=0;i<count;i++)
        {
            sortednum=sortednum*10+intArr[i];
        }
        /*if(temp<0)
        {
            sortednum=-sortednum;
        }*/
        variable.sortedString = "Sorted number in non-increasing order"+sortednum;
        variable.evenNumSum="Sum of even numbers"+sum;
        variable.checkString=(sum>15?true:false);
        return variable;
    }
}

