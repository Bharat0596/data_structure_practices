package com.BinaryTreeApplication;

import org.jetbrains.annotations.NotNull;

import java.util.*;

class Node1
{
    Node1 left;
    Node1 right;
    int item;
    Node1(int item)
    {
        this.item=item;
    }
}
public class PrintAllPath {

    Node1 root;

    public static void main(String[] args)
    {
        PrintAllPath bt=new PrintAllPath();

        bt.root=new Node1(3);
        bt.root.left=new Node1(5);
        bt.root.right=new Node1(8);
        bt.root.left.left=new Node1(6);
        bt.root.left.left.left=new Node1(1);
        bt.root.left.right=new Node1(2);
       // bt.root.left.right.left=new Node1(7);
        bt.root.left.right.right=new Node1(4);
        bt.root.right.left=new Node1(0);
        bt.root.right.right=new Node1(9);
        List<Integer> list=new ArrayList<Integer>();
        findAllLeafNodes(bt.root,list);
        System.out.println("==========================================");
        String s="";
        printPath(bt.root,s);

    }




    private static void findAllLeafNodes( Node1 root,List<Integer> list) {
        if(root == null){
            return;
        }
        if(root.left==null && root.right==null)
        {
            list.add(root.item);
            for(Integer i:list)
            {
                System.out.println(i+"   ");
            }
            list.remove(list.size()-1);
            return;
        }
       list.add(root.item);

       findAllLeafNodes(root.left,list);

       findAllLeafNodes(root.right,list);
       list.remove(list.size()-1);


    }

   private static void printPath(Node1 root,String s)
    {
        if(root==null)
            return;
        if(root.left==null && root.right==null)
        {
            s=s+root.item+"  ";
            System.out.println(s);
            return ;
        }
        s=s+root.item+"  ";
        printPath(root.left,s);
        printPath(root.right,s);

    }

}
