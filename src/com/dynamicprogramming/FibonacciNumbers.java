package com.dynamicprogramming;

public class FibonacciNumbers {
    public static void main(String[] args)
    {
        int n=6;
        System.out.println("fibonacci=>"+fibo(n));
    }

    private static int fibo(int n) {
        if(n<=1)
            return n;
        else
            return fibo(n-1)+fibo(n-2);
    }
}
