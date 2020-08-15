package program.leetcode;

import com.BinaryTreeApplication.TreeNode;
import jdk.nashorn.api.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    TreeNode root;
    public static void main(String[] args)
    {
        LevelOrderTraversal st=new LevelOrderTraversal();
        st.root=new TreeNode(3);
        st.root.left=new TreeNode(9);
        st.root.right=new TreeNode(20);
       // st.root.left.left=new TreeNode(3);
       // st.root.left.right=new TreeNode(4);
        st.root.right.left=new TreeNode(15);
        st.root.right.right=new TreeNode(7);
        List<List<Integer>> list=levelOrder(st.root);
        for(List i:list)
        {
            System.out.println(i);
        }
    }

    private static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list2=new ArrayList<>();
        if(root==null)
            return list2;

        Queue<TreeNode> que=new LinkedList<>();
        Queue<TreeNode> que2=new LinkedList<>();
        que.add(root);
        while(!que.isEmpty() || !que2.isEmpty())
        {
            List<Integer> list =new ArrayList<>();;
            while(!que.isEmpty()) {

                TreeNode node = que.remove();
                list.add(node.val);
                if (node.left != null) {
                    que2.add(node.left);
                }
                if (node.right != null) {
                    que2.add(node.right);
                }
            }
            if(!list.isEmpty()) {
                list2.add(list);
            }
            list=new ArrayList<>();
               while(!que2.isEmpty())
               {

                   TreeNode node = que2.remove();
                   list.add(node.val);
                   if(node.left!=null)
                   {
                       que.add(node.left);
                   }
                   if(node.right!=null)
                   {
                       que.add(node.right);
                   }
               }
               if(!list.isEmpty()) {
                   list2.add(list);
               }
        }
        return list2;
    }


}
