package program.leetcode;


import java.util.Stack;

class PNode
{
    int val;
    PNode next;
    PNode(int val)
    {
        this.val=val;
    }
}
public class PalindromeLinkedList {

    static PNode head;
    public static void main(String[] args)
    {
        PalindromeLinkedList pl=new PalindromeLinkedList();
        pl.head=new PNode(1);
        pl.head.next=new PNode(2);
        pl.head.next.next=new PNode(2);
        pl.head.next.next.next=new PNode(1);

//        boolean flag=isPalindrome(pl.head) ;
//        if(flag)
//        {
//            System.out.println(flag);
//        }else{
//            System.out.println(!flag);
//        }

        PNode n = isPalindrome(pl.head);
        System.out.println(n != null);


    }
    private static PNode isPalindrome(PNode temp) {

        if(temp.next==null) {
            return temp;
        }
        PNode n =  isPalindrome(temp.next);
        if(n == null){
            return n;
        }
        if((head.next == n && head.val == n.val) || head == n){
            return head;
        }
        if(head.val != n.val){
            return null;
        }
        head = head.next;
        return temp;
    }
    private static boolean isPalindrome1(PNode head) {

        Stack<Integer> stack=new Stack<>();
        PNode start=head;
        while(start!=null)
        {
            stack.push(start.val);
            start=start.next;
        }
        PNode start1=head;
        boolean flag=true;
        while(start1!=null)
        {
            int k=stack.pop();
            if(k!=start1.val)
            {
                return  false;
            }
            start1=start1.next;
        }
     return flag;

    }
}
