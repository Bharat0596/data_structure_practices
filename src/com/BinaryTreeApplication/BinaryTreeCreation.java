package com.BinaryTreeApplication;

import java.util.*;

class BNode
{
    BNode left;
    BNode right;
    int key;
    BNode(int key)
    {
        this.key=key;

    }


}
public class BinaryTreeCreation {
    BNode root;
    public static void main(String[] args)
    {
        BinaryTreeCreation bt=new BinaryTreeCreation();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number oif elements in the binary tree");
        int n=sc.nextInt();
        /*System.out.println("Enter the root node");
        int val=sc.nextInt();
        bt.root=new BNode(sc.nextInt());*/
        Queue<BNode> q=new LinkedList<BNode>();
        BNode[] array=new BNode[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the child node");
            BNode new_node=new BNode(sc.nextInt());
            array[i]=new_node;
            q.add(new_node);

        }
       // BNode start=createBinaryTree(bt.root,q);
        BNode start2=Method2BinaryTree(bt.root,array);
        BFS_Traversal(start2);
      //  BFS_Traversal(start);
    }

    private static BNode Method2BinaryTree(BNode root, BNode[] array) {

        for(int i=0;i<array.length;i++)
        {
            root=array[i];
            if((2*i+1)<array.length) {
                root.left = array[2 * i + 1];
            }
            if((2*i+2)<array.length) {
                root.right = array[2 * i + 2];
            }
        }
        return array[0];
    }

    private static  void BFS_Traversal(BNode start) {

        Queue<BNode > t=new LinkedList<>();
        t.add(start);

            while(!t.isEmpty()) {
                BNode var = t.poll();
                System.out.print(var.key+"  ");
                if (var.left != null) {
                    t.add(var.left);
                }
                if (var.right != null) {
                    t.add(var.right);
                }
            }
    }

    private static BNode createBinaryTree(BNode root, Queue<BNode> que)
    {
        Queue<BNode> temp=new LinkedList<BNode>();
        root=que.peek();
        temp.add(que.poll());

        while(temp!=null && !que.isEmpty())
        {

            int size=temp.size();
            for(int i=0;i<size;i++)
            {
                BNode curr=temp.peek();

                    if(curr.left==null)
                    {
                        BNode x=que.poll();
                        curr.left=x;
                        temp.add(x);
                    }
                     if(curr.right==null)
                    {
                        BNode x1=que.poll();
                        curr.right=x1;
                        temp.add(x1);
                    }
                    temp.poll();


            }
        }
        return root;
    }
}

