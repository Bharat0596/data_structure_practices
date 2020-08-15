package com.dynamicprogramming;

public class Minimumjumps {
    public static void main(String[] args)
    {
        int[] array={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int n=array.length;
        int[] jump=new int[n];
        jump[0]=0;
        for(int i=1;i<n;i++)
        {
            jump[i]=Integer.MAX_VALUE;
            for(int j=0;j<i;j++)
            {
                if(i<=j+array[j] && jump[j]!=Integer.MAX_VALUE)
                {
                    jump[i]=Math.min(jump[i],jump[j]+1);
                    break;
                }
            }
        }
        for(int i=0;i<n;i++) {
            System.out.print( jump[i]+"  ");
        }
    }
}
