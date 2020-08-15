package com.dynamicprogramming;

public class CoinChangeProblem {
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3};
        int m = arr.length;
        System.out.println( count(arr, m, 5));
    }

    private static int count(int[] arr, int m, int sum)
    {
        if(sum==0)
            return 1;

       else  if(m<=0 && sum>=1)
            return 0;

         if(arr[m-1]>sum)
            return count(arr,m-1,sum);
        else
            return count(arr,m-1,sum)+count(arr,m,sum-arr[m-1]);
    }
}
