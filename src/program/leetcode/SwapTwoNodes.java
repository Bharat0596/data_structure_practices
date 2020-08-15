package program.leetcode;

class SNode
{
    int key;
    SNode next;
    SNode(int key)
    {
        this.key=key;
    }
}
public class SwapTwoNodes {
    SNode head;
    public static void main(String[] args)
    {
        SwapTwoNodes sn=new SwapTwoNodes();
        sn.head=new SNode(1);
        sn.head.next=new SNode(2);
        sn.head.next.next=new SNode(3);
        sn.head.next.next.next=new SNode(4);
        SNode p=reverseList(sn.head);
        //swaping of two nodes code
       /* SNode start=sn.head;
        SNode prev,val;
        prev=start;
        val=start.next;
        val.next=prev;
        sn.head=val;
        prev.next=null;
*/
       // SNode p=sn.head;
        while(p!=null)
        {
            System.out.println(p.key);
            p=p.next;
        }
    }

    private static SNode reverseList(SNode head) {

        SNode prev=null,curr=head,after=null;
        SNode start=head;
        while(curr!=null)
        {
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;

        }
        return  head=prev;
    }
}
