package com.BinaryTreeApplication;

import java.util.*;

class PNode
{
    PNode left;
    PNode right;
    char key;
    PNode(char key)
    {
        this.key=key;
    }
}
public class InOrderPreOrderTreeCreation {

    PNode root;
    public static void main(String[] args)
    {
        Queue<Character> que=new LinkedList<Character>();
        Scanner sc=new Scanner(System.in);
        System.out.println("number of elemnts in preorder");
        int n=sc.nextInt();
        int count=0;
        while(count<n)
        {
            que.add(sc.next().charAt(0));
            count++;
        }
        List<Character> list=new ArrayList<Character>();
        System.out.println("enter the number of character in inorder");
        int m=sc.nextInt();
        int c=0;
        while(c<m)
        {
            list.add(sc.next().charAt(0));
            c++;
        }
        InOrderPreOrderTreeCreation bt=new InOrderPreOrderTreeCreation();
        PNode node=new PNode(que.poll());
        bt.root=node;

        while(!que.isEmpty())
        {
            PNode par = null;
            PNode curr = node;
            PNode new_node=new PNode(que.poll());
            while(curr!=null)
            {
                par=curr;
                if(list.indexOf(new_node.key)<list.indexOf(curr.key))
                {
                    curr=curr.left;
                }
                else
                {
                    curr=curr.right;
                }
            }
            if(list.indexOf(new_node.key)<list.indexOf(par.key))
            {
                par.left=new_node;
            }
            if(list.indexOf(par.key)<list.indexOf(new_node.key))
            {
                par.right=new_node;
            }
        }
        //level order traversal means BFS
        BFS_traversal(node);
    }

    private static void BFS_traversal(PNode root) {
        Queue<PNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            PNode val=q.peek();
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
