package com.dynamicprogramming;

public class Palindromicpartition {
    public static void main(String[] args)
    {
        String str="ababba";
        System.out.println(palindromePartition(str));
    }

    private static int palindromePartition(String str) {
        int n=str.length();
        int[][] cut=new int[n][n];
        boolean[][] isPal=new boolean[n][n];
        for(int i=0;i<n;i++)
        {
            cut[i][i]=0;
            isPal[i][i]=true;
        }
        for(int len=2;len<=n;len++)
        {
            for(int i=0;i<n-len+1;i++)
            {
                int j=len+i-1;
                if(str.charAt(i)==str.charAt(j) && j==i+1)
                {
                    cut[i][j]=0;
                    isPal[i][j]=true;
                }
                else if(str.charAt(i)==str.charAt(j) && isPal[i+1][j-1])
                {
                    cut[i][j]=0;
                    isPal[i][j]=true;
                }
                else if(isPal[i][j])
                {
                    cut[i][j]=0;
                }
                else
                {
                    cut[i][j]=Integer.MAX_VALUE;
                    for(int k=i;k<j;k++)
                    {
                        cut[i][j]=Integer.min(cut[i][j],cut[i][k]+cut[k+1][j]+1);
                    }
                }
            }
        }
        return  cut[0][n-1];
    }
}
