package com.BinaryTreeApplication;

import java.util.*;

public class BFSWithoutUsingQueue {

    public static int[][] graph=new int[4][4];
    public static int n=4;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int n=sc.nextInt();
        System.out.println("Make Graph");

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                graph[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the starting vertex");
        int v=sc.nextInt();
        BFS_Traversal(v);
    }

    private static void BFS_Traversal(int start)
    {
        Queue<Integer> q=new LinkedList<>();
        boolean[] visited=new boolean[n];
        q.add(start);
        visited[start]=true;
        while(!q.isEmpty())
        {
            int k=q.peek();
            System.out.println(k);
            visited[k]=true;
            q.poll();
            for(int i=0;i<n;i++)
            {
                if(graph[k][i]==1)
                {
                    if(visited[i]==false) {
                        q.add(i);
                    }
                }
            }
        }

    }
}
