package program.leetcode;

public class KthSmallestNumber {
    Node root;
    static int count=0;
    static int temp=0;
    public static void main(String[] args)
    {
        KthSmallestNumber kt=new KthSmallestNumber();
        kt.root=new Node(5);
        kt.root.left=new Node(3);
        kt.root.right=new Node(6);
        kt.root.left.left=new Node(2);
        kt.root.left.right=new Node(4);
        kt.root.left.left.left=new Node(1);

        int k=1;
        int p=findKthElement(kt.root,k);
        System.out.println(p);
    }

    private static int findKthElement(Node root, int k) {

        if(root==null)
            return 0;

        findKthElement(root.left,k);
        count++;
        if(count==k)
        {
            //System.out.println(root.val);
            temp=root.val;
        }
        findKthElement(root.right,k);
        return temp;
    }
}
