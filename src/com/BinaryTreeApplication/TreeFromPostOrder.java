package com.BinaryTreeApplication;

import java.util.*;

class PoNode
{
    PoNode left;
    PoNode right;
    int key;
    PoNode(int key)
    {
        this.key=key;
    }
}
public class TreeFromPostOrder {

    PoNode root;
    public static void main(String[] args)
    {
        Stack<Integer> stack=new Stack<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number post order elemet");
        int n=sc.nextInt();
        int i=0;
        while(i<n)
        {
            stack.push(sc.nextInt());
            i++;
        }
        List<Integer> list=new ArrayList<Integer>();
        System.out.println("Enter the number post inorder elemet");
        int m=sc.nextInt();
        int j=0;
        while(j<m)
        {
           list.add(sc.nextInt());
           j++;

        }
        TreeFromPostOrder bt=new TreeFromPostOrder();
        PoNode node=new PoNode(stack.pop());
        bt.root=node;
        while(!stack.isEmpty())
        {
            PoNode par=null;
            PoNode curr=node;
            PoNode new_node=new PoNode(stack.pop());
            while(curr!=null)
            {
                par=curr;
                if(list.indexOf(new_node.key)<list.indexOf(curr.key))
                {
                    curr=curr.left;
                }
                else if(list.indexOf(new_node.key)>list.indexOf(curr.key))
                {
                    curr=curr.right;
                }
            }
            if(list.indexOf(new_node.key)<list.indexOf(par.key))
            {
                par.left=new_node;
            }
            if(list.indexOf(new_node.key)>list.indexOf(par.key))
            {
                par.right=new_node;
            }
        }
        BFS_traversal(bt.root);

    }

    private static void BFS_traversal(PoNode root) {
        Queue<PoNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            PoNode val=q.peek();
            System.out.print(val.key+"  ");
            q.poll();
            if(val.left!=null)
            {
                q.add(val.left);
            }
            if(val.right!=null)
            {
                q.add(val.right);
            }
        }
    }
}
