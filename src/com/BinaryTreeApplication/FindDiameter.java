package com.BinaryTreeApplication;

class DNode
{
    DNode left;
    DNode right;
    int key;
    DNode(int key)
    {
        this.key=key;
    }
}
public class FindDiameter {
    DNode root;
    public static void main(String[] args)
    {
        FindDiameter bt=new FindDiameter();
        bt.root=new DNode(3);
        bt.root.left=new DNode(5);
        bt.root.right=new DNode(8);
        bt.root.left.left=new DNode(6);
        bt.root.left.left.left=new DNode(1);
        bt.root.left.left.left.left=new DNode(10);
        bt.root.left.left.left.left.left=new DNode(11);

        bt.root.left.right=new DNode(2);
        bt.root.left.right.left=new DNode(7);
        bt.root.left.right.left.right=new DNode(6);
        bt.root.left.right.left.right.right=new DNode(9);
        bt.root.left.right.right=new DNode(4);
        bt.root.right.left=new DNode(0);
        bt.root.right.right=new DNode(9);
        int d=Diameter(bt.root);
        System.out.println("Diameter for the Binary tree=>"+d);
    }

    private static int Diameter(DNode root)
    {
        if(root==null)
            return 0;
        int lheight=findHeight(root.left);
        int rheight=findHeight(root.right);

        int ldiameter=Diameter(root.left);
        int rdiameter=Diameter(root.right);

        return Math.max(lheight+rheight+1,Math.max(ldiameter,rdiameter));
    }

    private static int findHeight(DNode node) {

        if(node==null)
            return 0;
        else
            return 1+Math.max(findHeight(node.left),findHeight(node.right));
    }
}
