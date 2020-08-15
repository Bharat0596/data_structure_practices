package program.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val)
    {
        this.val=val;
    }
}
public class PreInobinaruyTree {
    TreeNode root;
    public static void main(String[] args)
    {
        PreInobinaruyTree bt=new PreInobinaruyTree();

        int[] preorder={3,9,20,15,7};
        int[] inorder={9,3,15,20,7};
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<inorder.length;i++)
        {
            list.add(inorder[i]);
        }
        bt.root=new TreeNode(preorder[0]);
        TreeNode par=createTree(preorder,list,0,inorder.length-1);
        System.out.println(count);
    }
    static int count=0;
    private static TreeNode createTree(int[] preorder, List list, int start, int end) {

        if(start>end)
        {
            return null;
        }
        TreeNode par =new TreeNode(preorder[count++]);
        if(start==end)
            return par;


        par.left=createTree(preorder,list,start,list.indexOf(par.val)-1);
        par.right=createTree(preorder,list,list.indexOf(par.val)+1,end);
       return par;
    }
}
