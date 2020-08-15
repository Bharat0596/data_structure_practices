package program.leetcode;

class depthNode
{
    depthNode left;
    depthNode right;
    int val;
    depthNode(int val)
    {
        this.val=val;
    }
}
public class DepthOFTree {
    depthNode root;
    static Long value=Long.MIN_VALUE;
    static boolean flag=true;

    public static void main(String[] args)
    {
        DepthOFTree bt=new DepthOFTree();
        bt.root=new depthNode(-2147483648);
      //  bt.root.left=new depthNode(null);
       // bt.root.right=new depthNode(2147483647);
       /* bt.root.right.left=new depthNode(3);
        bt.root.right.right=new depthNode(6);*/
         //int depth=maxDepth(bt.root);
       // System.out.println(depth);
        //System.out.println(Integer.MIN_VALUE);
        //System.out.println();

        boolean p=isValidBST(bt.root);
        if(p) {
            System.out.println( p);
        }else{
            System.out.println( p);
        }
    }




    private static boolean isValidBST(depthNode root) {


        if(root==null )
            return true;

        isValidBST(root.left);

        if(value<root.val)
        {
            value=(long) root.val;
        }else{
            flag= false;

        }
        isValidBST(root.right);
        return flag;

    }

    private static int maxDepth(depthNode node) {
        if(node==null)
            return 0;
        if(node.left==null && node.right==null)
        {
            return  1;
        }
        int leftheight=maxDepth(node.left);
        int rightheight=maxDepth(node.right);


        return 1+Math.max(leftheight,rightheight);
    }
}
