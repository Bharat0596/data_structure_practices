package program.leetcode;

import java.util.Scanner;

public class demo {

    public static void main(String[] args)
    {
               System.out.println("Enter two elements");
        Scanner sc=new Scanner(System.in);
        int sum=findsum(sc.nextInt(),sc.nextInt());
        System.out.println("sum="+sum);

    }

    private static int findsum(int a, int b) {
        return a+b;
    }
}
