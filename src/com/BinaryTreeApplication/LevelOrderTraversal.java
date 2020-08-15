package com.BinaryTreeApplication;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class LNode
{
    LNode left;
    LNode right;
    int key;
    LNode(int key)
    {
        this.key=key;
    }
}
public class LevelOrderTraversal {
    LNode root;
    public static void main(String[] args)
    {
        LevelOrderTraversal bt=new LevelOrderTraversal();
        bt.root=new LNode(3);
        bt.root.left=new LNode(5);
        bt.root.right=new LNode(8);
        bt.root.left.left=new LNode(6);
        bt.root.left.left.left=new LNode(1);
        bt.root.left.right=new LNode(2);
         bt.root.left.right.left=new LNode(7);
        bt.root.left.right.right=new LNode(4);
        bt.root.right.left=new LNode(0);
        bt.root.right.right=new LNode(9);
        levelOrder(bt.root);
        //RecursiveTraversal(bt.root);

    }

    private static void RecursiveTraversal(LNode root) {

        if(root==null)
        {
            return;
        }
        System.out.println(root.key);
        RecursiveTraversal(root.left);
        RecursiveTraversal(root.right);
    }

    private static <stack> void levelOrder(LNode root)
    {
        int h=findHeight(root);
        int h1=findHeightMin(root);
        int max=Integer.MIN_VALUE;
        System.out.println("Height of tree=>"+h+"Minimum height of tree=> "+h1);
        System.out.println("Diameter of binary tree=>"+(h+h1-1));
        int level=0;
        Queue<LNode> q1=new LinkedList<LNode>();
        Queue<LNode> q2=new LinkedList<LNode>();
        /*Stack<LNode> q1=new Stack<LNode>();
        Stack<LNode> q1=new Stack<LNode>();*/
        q1.add(root);
        while(level!=h)
        {
            while(!q1.isEmpty()) {
                if(q1.size()>max)
                    max=q1.size();
                LNode val = q1.peek();
                q1.poll();
                System.out.print(val.key+"  ");
                if (val.left != null) {
                    q2.add(val.left);
                }
                if (val.right != null) {
                    q2.add(val.right);
                }
            }
           level++;
            System.out.println();
            while(!q2.isEmpty())
            {
                if(q2.size()>max)
                    max=q2.size();
                LNode val=q2.peek();
                System.out.print(val.key+"  ");
                q2.poll();
                if(val.left!=null)
                {
                    q1.add(val.left);
                }
                if(val.right!=null)
                {
                    q1.add(val.right);
                }
            }
            level++;
            System.out.println();
        }
        System.out.println("Maximum Width=>"+max);
    }

    private static int findHeightMin(LNode root) {
        if(root==null)
            return 0;
        return 1+Math.min(findHeight(root.left),findHeight(root.right));
    }

    private static int findHeight(LNode root)
    {
        if(root==null)
            return 0;
        return 1+Math.max(findHeight(root.left),findHeight(root.right));
    }
}
