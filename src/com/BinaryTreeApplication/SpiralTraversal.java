package com.BinaryTreeApplication;

import java.util.Stack;

class SNode
{
    SNode left;
    SNode right;
    int key;
    SNode(int key)
    {
        this.key=key;
    }
}
public class SpiralTraversal {
    SNode root;
    public static void main(String[] args)
    {
        SpiralTraversal bt=new SpiralTraversal();
        bt.root=new SNode(3);
        bt.root.left=new SNode(5);
        bt.root.right=new SNode(8);
        bt.root.left.left=new SNode(6);
        bt.root.left.left.left=new SNode(10);
        bt.root.left.left.right=new SNode(11);
        //.root.left.left.right.left=new SNode(12);
      //  bt.root.left.left.right.left.left=new SNode(13);
        bt.root.left.right=new SNode(2);
        bt.root.left.right.left=new SNode(7);
        bt.root.left.right.right=new SNode(4);
        bt.root.right.left=new SNode(0);
        bt.root.right.right=new SNode(9);
        Spiral_Traversal(bt.root);
    }

    private static void Spiral_Traversal(SNode root) {
        Stack<SNode> s1=new Stack<SNode>();
        Stack<SNode> s2=new Stack<SNode>();
        s1.push(root);
        while(!s1.isEmpty() || !s2.isEmpty())
        {
            while(!s1.isEmpty())
            {
                SNode p=s1.pop();
                System.out.print(p.key+"  ");
                if(p.left!=null)
                {
                    s2.push(p.left);
                }
                if(p.right!=null)
                {
                    s2.push(p.right);
                }
            }
            System.out.println();
            while(!s2.isEmpty())
            {
                SNode q=s2.pop();
                System.out.print(q.key+" ");
                if(q.right!=null)
                {
                    s1.push(q.right);
                }
                if(q.left!=null)
                {
                    s1.push(q.left);
                }
            }
            System.out.println();
        }
    }
}
