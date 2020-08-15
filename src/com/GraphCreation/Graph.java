package com.GraphCreation;

import com.BinaryTreeApplication.TopologicalSort;

import java.util.*;

class Edge
{
    Vertex v1;
    Vertex v2;
    Edge(Vertex v1,Vertex v2)
    {
        this.v1=v1;
        this.v2=v2;
    }
}
class Vertex
{
    int key;
    List<Edge> edges;
    List<Vertex> adjVertex;
    Vertex(int key)
    {
        this.key=key;
        this.edges=new ArrayList<Edge>();
        this.adjVertex=new ArrayList<Vertex>();
    }
    public void addVertex(Edge e)
    {
        edges.add(e);
        adjVertex.add(e.v2);
    }
}
public class Graph {
    boolean isDirected;
    List<Edge> graphEdges;
    Map<Integer,Vertex> vertexList;
    Graph(boolean isDirected)
    {
        this.isDirected=isDirected;
        this.graphEdges=new ArrayList<Edge>();
        this.vertexList=new HashMap<Integer, Vertex>();
    }
    public  void addVertex(int a,int b)
    {
        Vertex av;
        Vertex bv;
        if(vertexList.containsKey(a))
        {
            av=vertexList.get(a);
        }else{
            av=new Vertex(a);
            vertexList.put(a,av);
        }
        if(vertexList.containsKey(b))
        {
            bv=vertexList.get(b);
        }else{
            bv=new Vertex(b);
            vertexList.put(b,bv);
        }
        Edge e=new Edge(av,bv);
        av.addVertex(e);
        graphEdges.add(e);


    }
    public static void main(String[] args)
    {
        Graph g=new Graph(true);
        g.addVertex(1,2);
        g.addVertex(1,3);
        g.addVertex(2,4);
        g.addVertex(2,5);
        g.addVertex(3,6);
        System.out.println("DFS TRAVERSAL");
        DFS_traversal(g);
        System.out.println("=====================================================");
        System.out.println("BFS TRAVERSAL");
        BFS_Traversal(g);
        System.out.println("=====================================================");
        System.out.println("Topological Sort");
        Topological_sort(g);

    }

    private static void Topological_sort(Graph g) {
        Stack<Vertex> stack=new Stack<>();
        Set<Vertex> visited=new HashSet<>();
        for(Map.Entry<Integer,Vertex> x:g.vertexList.entrySet())
        {
            Vertex k=x.getValue();
            if(!visited.contains(k)) {
                do_topologicalsort(x.getValue(), stack, visited);
            }
        }
        while (!stack.isEmpty())
        {
            System.out.print(stack.pop().key+"  ");
        }
    }

    private static void do_topologicalsort(Vertex x, Stack<Vertex> stack, Set<Vertex> visited) {

            if(!visited.contains(x))
            {
                for(Vertex v: x.adjVertex)
                {
                    do_topologicalsort(v,stack,visited);
                }
                stack.push(x);
                visited.add(x);
            }
    }

    private static void BFS_Traversal(Graph g) {
        for(Map.Entry<Integer,Vertex> v:g.vertexList.entrySet())
        {
            Queue<Vertex> que=new LinkedList<>();
            Set<Vertex> visited=new HashSet<>();
            Vertex x=v.getValue();
            System.out.println("Starting vertex="+x.key);


            que.add(x);

            while(!que.isEmpty())
            {
                Vertex p=que.poll();
                System.out.print(p.key+"  ");
                visited.add(p);
                for(Vertex i:p.adjVertex)
                {
                    if(!visited.contains(i))
                    {
                        que.add(i);
                    }
                }
            }
            System.out.println();
        }
    }

    private static void DFS_traversal(Graph g) {

        for(Map.Entry<Integer,Vertex> v:g.vertexList.entrySet())
        {
            Stack<Vertex> stack=new Stack<Vertex>();
            Set<Vertex> visited=new HashSet<>();
            Vertex x=v.getValue();
            System.out.println("Starting vertex="+x.key);


            stack.push(x);

           while(!stack.isEmpty())
           {
               Vertex p=stack.pop();
               System.out.print(p.key+"  ");
               visited.add(p);
               for(Vertex i:p.adjVertex)
               {
                   if(!visited.contains(i))
                   {
                       stack.push(i);
                   }
               }
           }
            System.out.println();
        }
    }
}
