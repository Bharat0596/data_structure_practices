package program.leetcode;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class NumberOfIslands {
    private static boolean isValidPath(int[][]  graph,int xc, int yc) {
        int row=graph.length;
        int column=graph[0].length;
        String v = xc + "=>" + yc;
        if(xc>=row || yc>=column || xc<0 || yc<0 || graph[xc][yc] == 0 || visited.contains(v))
        {
            return  false;
        }
        return  true;
    }
    public static void main(String[] args)
    {
       int[][] graph=  {
                {1,1,0,0,0},
                {1,1,0,0,0},
                {0,0,1,0,0},
                {0,0,0,1,1}
        };



        //System.out.println("find Number of islands in the graph");
       // findNumberOfIslands(graph);
        findNumberOfIslandsMethod2(graph);

    }

    private static void findNumberOfIslandsMethod2(int[][] graph) {


        int row=graph.length;
        if(row==0)
            return;
        int column=graph[0].length;
        int count=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(graph[i][j]==1)
                {
                    count++;
                    dfsMethod2(graph,i,j);
                }
            }
        }
        System.out.println(count);
    }

    private static void dfsMethod2(int[][] graph, int xc, int yc) {
        if(!isValidPath(graph,xc,yc))
        {
            return ;
        }
        graph[xc][yc]=0;
        dfsMethod2(graph,xc+1,yc);
        dfsMethod2(graph,xc-1,yc);
        dfsMethod2(graph,xc,yc+1);
        dfsMethod2(graph,xc,yc-1);

    }


    private static void findNumberOfIslands(int[][] graph) {


        int row=graph.length;
        if(row==0)
            return;
        int column=graph[0].length;

        int count=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {

                if(isValidPath(graph, i, j))
                {
                    depthFirstSearch(graph,i,j);
                    count++;
                }
            }
        }
        System.out.println(count);

    }
    static Set<String> visited=new HashSet<>();
    private static void depthFirstSearch(int[][] graph, int xCord, int yCord) {
        int[] x={0,0,-1,1};
        int[] y={1,-1,0,0};
        Stack<String> stack=new Stack<>();

        String v=xCord+"=>"+yCord;
        stack.push(v);
        while(!stack.isEmpty())
        {
            String k=stack.pop();
            String[] cord = k.split("=>");
            int xc = Integer.parseInt(cord[0]);
            int yc = Integer.parseInt(cord[1]);

            visited.add(k);
            for(int i=0;i<x.length;i++)
            {
                int p1=xc+x[i];
                int q1=yc+y[i];
                if(isValidPath(graph,p1,q1))
                {
                    stack.push(p1 + "=>" + q1);
                }
            }
        }

    }






















    private static void dfs(int[][] graph, int v) {
        int row=graph.length;
        int column=graph[0].length;
        Stack<Integer> stack=new Stack<Integer>();
        Set<Integer> visited=new HashSet<>();
        stack.push(v);

        while(!stack.isEmpty()) {
            int vertex = stack.pop();
            visited.add(vertex);
            System.out.print(vertex+"  ");
            for (int j = 0; j < column; j++) {

                if (graph[vertex][j] == 1 && !visited.contains(j)) {
                    stack.push(j);
                }
            }
        }
    }
}
