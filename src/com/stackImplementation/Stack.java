package com.stackImplementation;

import java.util.Scanner;

public class Stack {
    static int[] stack=new int[10];
    static int top=-1,max=10;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("1. Push  2. Pop 3. Peek 4.Display 5.Exit" );
            int choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter elements to be pushed");
                    int item=sc.nextInt();
                    boolean flag=Push(item);
                    if(flag)
                        System.out.println("Pushed successfully");
                    break;
                case 2:
                    int val=Pop();
                    if(val!=-1) {
                        System.out.println("Popped value=>" + val);
                    }
                        break;
                case 3:
                    System.out.println(stack[top]);
                    break;
                case 4:
                    Display();
                    break;
                case 5:
                    System.out.println("bye bye");
                    System.exit(0);

            }
        }
    }

    public static void Display() {
        for(int i=0;i<=top;i++)
        {
            System.out.print(stack[i]+"  ");
        }
        System.out.println();
    }

    public static int Pop() {
        if(isEmpty())
        {
            System.out.println("Underflow");
            return -1;
        }
        else
            return stack[top--];
    }

    public static boolean isEmpty() {
        if(top==-1)
            return true;
        return false;
    }

    public static boolean Push(int item) {


        if(isFull())
        {
            System.out.println("can't be Pushed");
            return false;
        }
        else {
            stack[++top] = item;
            return true;
        }

    }

    private static boolean isFull()
    {
        if(top==max-1)
            return true;
        return false;
    }
}
