package com.BinaryTreeApplication;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

/*
concept:-
for each and every node look for the child node.
if child node is there and it is unvisited(set does not contain it) then
put it into the stack and make it visited(put into set ) and later check weather the parent is
visited or not.if not then visit it and put it into stack.
finally pop all nodes one by one from the stack.
* */
public class TopologicalSort {

    public static int[][] graph=new int[6][6];
    public static Stack<Integer> stack=new Stack<Integer>();
    public static Set<Integer> set=new HashSet<Integer>();
    public static void main(String[] args)
    {

        TopologicalSort bt=new TopologicalSort();
        Scanner sc=new Scanner(System.in);
        System.out.println("make the graph");
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
               graph[i][j]=sc.nextInt();
            }
        }
        /*for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                System.out.print(graph[i][j]+"  ");
            }
            System.out.println();
        }*/
         for(int i=0;i<6;i++)
         {
             Topological_sort(i);
         }
         while(!stack.isEmpty())
         {
             System.out.print(stack.pop()+"  ");
         }

    }

    private static void Topological_sort(int i) {

        int v=i;
        for(int j=0;j<6;j++)
        {
            if(graph[v][j]==1 && !set.contains(j))
            {
                stack.push(j);
                set.add(j);
            }
        }
        if(!set.contains(v)) {
            stack.push(v);
            set.add(v);
        }

    }
}
