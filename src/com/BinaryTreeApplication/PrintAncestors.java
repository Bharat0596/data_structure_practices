package com.BinaryTreeApplication;

class ANode
{
    ANode left;
    ANode right;
    int key;
    ANode(int key)
    {
        this.key=key;
    }
}
public class PrintAncestors {
    ANode root;
    public static void main(String[] args)
    {
        PrintAncestors bt=new PrintAncestors();

        bt.root=new ANode(3);
        bt.root.left=new ANode(5);
        bt.root.right=new ANode(8);
        bt.root.left.left=new ANode(6);
        bt.root.left.left.left=new ANode(10);
        bt.root.left.left.right=new ANode(11);
        bt.root.left.left.right.left=new ANode(12);
        bt.root.left.left.right.left.left=new ANode(13);
        bt.root.left.right=new ANode(2);
        bt.root.left.right.left=new ANode(7);
        bt.root.left.right.right=new ANode(4);
        bt.root.right.left=new ANode(0);
        bt.root.right.right=new ANode(9);
        String ancestors="";
        ancestorsOfNode(bt.root, bt.root.left.left.right.left,ancestors);
    }

    private static void ancestorsOfNode(ANode root,ANode node,String ancestors) {

        if(root==null)
        {
            return;
        }
        if(root.left==node || root.right==node)
        {
            ancestors=ancestors+root.key;
            StringBuffer sb=new StringBuffer(ancestors);
            System.out.println(sb.reverse());
            return;
        }
        ancestors=ancestors+root.key+">------";
        ancestorsOfNode(root.left,node,ancestors);
        ancestorsOfNode(root.right,node,ancestors);
    }

}
