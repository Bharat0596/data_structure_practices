package com.BinaryTreeApplication;

import java.util.*;

class Node {
    Node left;
    Node right;
    int item;
    Node(int item)
    {
        this.item=item;
    }
}
public class BinaryTree {

    public static Map<Node,Node> has=new HashMap<>();
    Node root;
    BinaryTree()
    {
        root=null;
    }
    public static void main(String[] args)
    {
        BinaryTree bt=new BinaryTree();
        bt.root=new Node(3);
        bt.root.left=new Node(5);
        bt.root.right=new Node(8);
        bt.root.left.left=new Node(6);
        bt.root.left.right=new Node(2);
        bt.root.left.right.left=new Node(7);
        bt.root.left.right.right=new Node(4);
        bt.root.right.left=new Node(0);
        bt.root.right.right=new Node(9);
        populateParent(bt.root);
       /* for(Map.Entry<Node,Node> es:has.entrySet())
        {
            System.out.println(es.getKey().item+" =>"+es.getValue().item);
        }*/
        int k=2;
        KDistance(bt.root.left,k);
    }

    private static void KDistance(Node src, int k)
    {
        int level=0;
        Queue<Node> q=new LinkedList();
        Set<Node> set =new HashSet<Node>();

        q.add(src);

        while(level!=k)
        {

            int size=q.size();
            for(int i=0;i<size;i++)
            {
                Node val=q.poll();
                set.add(val);
                if(val.left!=null && !set.contains(val.left))
                {
                    q.add(val.left);
                }
                if(val.right!=null && !set.contains(val.right))
                {
                    q.add(val.right);
                }
                if(has.containsKey(val) && !set.contains(has.get(val)))
                {
                    q.add(has.get(val));
                }

            }
            if(q.isEmpty()){
                break;
            }
            level++;
        }
        int size = q.size();
        for(int i=0;i<size;i++)
        {
            System.out.println(q.poll().item);
        }
    }

    private static void populateParent(Node root) {
        if(root==null)
            return;
        if(root.left!=null)
        {
            has.put(root.left,root);
        }
        if(root.right!=null)
        {
            has.put(root.right,root);
        }
        populateParent(root.left);
        populateParent(root.right);

    }
}
