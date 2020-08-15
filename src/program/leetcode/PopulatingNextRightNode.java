package program.leetcode;

class Node
{
    int val;
    Node left;
    Node right;
    Node next;
    Node(int val) {
        this.val = val;
    }
}
public class PopulatingNextRightNode {
    Node root;
    Node prevNode = null;
    public static void main(String[] args)
    {
        PopulatingNextRightNode pt=new PopulatingNextRightNode();
        pt.root=new Node(1);
        pt.root.left=new Node(2);
        pt.root.right=new Node(3);
        pt.root.left.left=new Node(4);
        pt.root.left.right=new Node(5);
        pt.root.right.left=new Node(6);
        pt.root.right.right=new Node(7);


        pt.levelOrder(pt.root);

    }

    private int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        if(lh > rh){
            return 1 + lh;
        }
        return 1 + rh;
    }

    private void levelOrder(Node root){
        int h = height(root);
        for(int i=1; i<=h; i++) {
            prevNode = null;
            getRightpointer(root, i);
        }
    }

    private  void getRightpointer(Node root, int k) {

       if(root == null) {
           return;
       }
       if(k == 1){
           if (prevNode != null) {
               prevNode.next = root;
           }
           prevNode = root;
       }
       getRightpointer(root.left, k-1);
       getRightpointer(root.right, k-1);
    }
}
