package com.dynamicprogramming;

public class CuttingRodProblem {
    public static void main(String[] args)
    {
        int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20};
        int size = arr.length;
        System.out.println("Maximum Obtainable Value is "+
                cutRod(arr, size));
    }

    private static int cutRod(int[] arr, int size) {

        int[][] profit=new int[size+1][size+1];
        for(int i=0;i<=size;i++)
        {
            profit[1][i]=i*arr[1-1];
        }
        for(int i=2;i<=size;i++)
        {
            for(int j=0;j<=8;j++)
            {
                if(j<i)
                    profit[i][j]=profit[i-1][j];
                else
                    profit[i][j]=Math.max((profit[i][j-i]+arr[i-1]),profit[i-1][j]);
            }
        }
        for(int i=1;i<=size;i++)
        {
            for(int k=0;k<=size;k++)
            {
                System.out.print(profit[i][k]+"  " );
            }
            System.out.println();
        }
        return profit[size][size];
    }
}
