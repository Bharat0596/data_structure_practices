package program.leetcode;

public class AdditionInLinkedList {
    LNode head1;
    LNode head2;
    LNode head3;
    public static void main(String[] args)
    {
        AdditionInLinkedList bt=new AdditionInLinkedList();
        bt.head1=new LNode(0);
        bt.head1.next=new LNode(4);
        bt.head1.next.next=new LNode(8);
        bt.head1.next.next.next=new LNode(4);

        bt.head2=new LNode(5);
        bt.head2.next=new LNode(6);
        bt.head2.next.next=new LNode(4);
       bt.head2.next.next.next=new LNode(1);
        LNode start1=bt.head1;
        LNode start2=bt.head2;

        bt.head3=new LNode(0);
        LNode dummy=bt.head3;
        int carry=0;
        while(start1!=null || start2!=null)
        {
            int x=0,y=0;
            if(start1!=null)
            {
                x=start1.key;
                start1=start1.next;
            }
            if(start2!=null)
            {
                y=start2.key;
                start2=start2.next;
            }
            int m=carry+x+y;
            dummy.next=new LNode(m%10);
            dummy=dummy.next;
            carry=m/10;

        }
        if(carry>0)
        {
            dummy.next=new LNode(carry);
        }



        LNode p=bt.head3.next;
        while(p!=null)
        {
            System.out.println(p.key);
            p=p.next;
        }

    }

    private static void find(LNode head1) {
        LNode start1=head1;
        System.out.println(start1.key);
    }
}
