package com.dynamicprogramming;

public class EditDistance {
    public static void main(String[] args)
    {
        String str1 = "sunday";
        String str2 = "saturday";

        System.out.println(editDist(str1, str2, str1.length(), str2.length()));
    }

    private static int editDist(String str1, String str2, int m, int n) {
        if(m==0)
            return n;
         if(n==0)
            return m;
         if(str1.charAt(m-1)== str2.charAt(n-1))
            return editDist(str1,str2,m-1,n-1);
        else
            return 1+Math.min(editDist(str1,str2,m-1,n),Math.min(editDist(str1,str2,m,n-1),
                    editDist(str1,str2,m-1,n-1)));
    }
}
