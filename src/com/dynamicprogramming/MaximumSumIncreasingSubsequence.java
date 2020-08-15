package com.dynamicprogramming;

public class MaximumSumIncreasingSubsequence {

    public static void main(String[] args)
    {
        int arr[] = new int[]{1, 101, 2, 3, 100, 4, 5};
        int n = arr.length;
        System.out.println("Sum of maximum sum "+
                "increasing subsequence is "+
                maxSumIS(arr, n));
    }

    private static int maxSumIS(int[] arr, int n) {

        int[] sum=new int[n];
        for(int i=0;i<n;i++)
        {
            sum[i]=arr[i];
        }
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[i]>arr[j] && sum[i]<sum[j]+arr[i] )
                {
                    sum[i]=sum[i]+arr[j];
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(sum[i]+"  ");
        }
        System.out.println();
        return 0;
    }
}
