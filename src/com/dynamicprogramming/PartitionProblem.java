package com.dynamicprogramming;

public class PartitionProblem {

    public static void main(String[] args)
    {
        int[] array={5,11};
        int sum=0;
        int n=array.length;
        for(int i=0;i<n;i++)
        {
            sum=sum+array[i];
        }
        if(sum%2==0)
        {
            boolean flag=partition(array,n,sum/2);
            if(flag)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
        else
        {
            System.out.println("partition not possible");
        }
    }

    private static boolean partition(int[] array, int n, int sum) {
        if(sum==0)
            return true;
        else if(n==0 && sum!=0)
            return false;
        else if(array[n-1]>sum)
            return partition(array,n-1,sum);
        else
            return partition(array,n-1,sum-array[n-1]) || partition(array,n-1,sum);
    }
}
