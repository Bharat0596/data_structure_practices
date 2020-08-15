package com.BinaryTreeApplication;

import jdk.nashorn.api.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
    TreeNode root;
    static Queue<TreeNode> que=new LinkedList<TreeNode>();
    public static void main(String[] args)
    {
        SymmetricTree st=new SymmetricTree();
        st.root=new TreeNode(1);
        st.root.left=new TreeNode(2);
        st.root.right=new TreeNode(2);
       st.root.left.left=new TreeNode(3);
        st.root.left.right=new TreeNode(4);
        st.root.right.left=new TreeNode(4);
        st.root.right.right=new TreeNode(3);
        boolean flag=isSymmetric(st.root.left,st.root.right);
        System.out.println(flag);
        //itterartive approch to check the symmetry of the tree
        que.add(st.root.left);
        que.add(st.root.right);
        boolean flag1=isSymmetric1(que);
        System.out.println("By itterative approch="+flag1);
    }

    private static boolean isSymmetric1(Queue<TreeNode> que) {


        while(!que.isEmpty()) {
            TreeNode node1 = que.remove();
            TreeNode node2 = que.remove();

            if(node1==null && node2==null)
            {
                continue;
            }
            if ( node1.val!=node2.val) {

                return false;
            }
            if ((node1.left == null && node2.right != null) || (node1.right == null && node2.left != null)) {

                return false;
            }
            que.add(node1.left);
            que.add(node2.right);
            que.add(node1.right);
            que.add(node2.left);
        }
        return true;
    }

    private static boolean isSymmetric(TreeNode root1,TreeNode root2) {

        if(root1==null && root2==null)
            return true;

        if((root1!=null && root2!=null) && (root1.val==root2.val))
        {
            return (isSymmetric(root1.left,root2.right)&&isSymmetric(root1.right,root2.left));
        }

        return false;

    }



}
