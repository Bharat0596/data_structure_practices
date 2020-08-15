package program.leetcode;

import com.BinaryTreeApplication.TreeNode;

public class BalancedBinaryTree {

    TreeNode root;
    public static void main(String[] args)
    {
        BalancedBinaryTree bt=new BalancedBinaryTree();
        int[] array= {-10,-3,0,5,9};
        int n=array.length;
        TreeNode start=cretaeBinaryTree(array,0,n-1);
        Traverse(start);
    }

    private static void Traverse(TreeNode start) {

        if(start==null)
            return;

        System.out.println(start.val);
        Traverse(start.left);
        Traverse(start.right);
    }

    private static TreeNode cretaeBinaryTree(int[] array,int low, int up) {

        if(low>up) {
            return null;
        }
            int mid = (low + up) / 2;
            TreeNode temp = new TreeNode(array[mid]);

            temp.left = cretaeBinaryTree(array, low, mid-1 );
            temp.right = cretaeBinaryTree(array,mid + 1, up);

        return temp;
    }
}
