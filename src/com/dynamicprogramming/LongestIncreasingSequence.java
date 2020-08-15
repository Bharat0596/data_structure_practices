package com.dynamicprogramming;

public class LongestIncreasingSequence {

    public static void main(String[] args)
    {
        int[] array={10, 22, 9, 33, 21, 50, 41, 60, 80};
        findLCS(array,array.length);
    }

    private static void findLCS(int[] array, int n) {
        int[] temp=new int[n];
        for(int i=0;i<n;i++)
        {
            temp[i]=1;
        }
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(array[i]>array[j] && temp[i]<temp[j]+1)
                {
                    temp[i]=temp[j]+1;
                }
            }
        }
        int max= Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(max<temp[i])
            {
                max=temp[i];
            }
        }
        System.out.println("Longest Increasing Sequence=>"+max);
    }
}
