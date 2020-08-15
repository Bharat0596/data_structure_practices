package program.leetcode;

class MNode
{
    int key;
    MNode next;
    MNode(int key)
    {
        this.key=key;
    }
}
public class MergeTwoSortedLinkedList {
    MNode head1;
    MNode head2;
    MNode head3;

    public static void main(String[] args)
    {
        MergeTwoSortedLinkedList ms=new MergeTwoSortedLinkedList();
        ms.head1=new MNode(1);
        ms.head1.next=new MNode(2);
        ms.head1.next.next=new MNode(3);

        ms.head2=new MNode(1);
        ms.head2.next=new MNode(3);
        ms.head2.next.next=new MNode(4);

        MNode start1=ms.head1;
        MNode start2=ms.head2;
        MNode start3=ms.head3;

        ms.head3=new MNode(0);
        MNode p=ms.head3;


        while(start1!=null && start2!=null)
        {
            MNode temp = null;
           if(start1.key>=start2.key)
           {
               temp =new MNode(start2.key);
              start2=start2.next;

           }else{
               temp=new MNode(start1.key);
               start1=start1.next;
           }
            p.next=temp;
            p = p.next;
        }
        while(start1!=null)
        {
            MNode temp=new MNode(start1.key);
            p.next=temp;
            p= p.next;
            start1=start1.next;
        }
        while(start2!=null)
        {
            MNode temp=new MNode(start2.key);
            p.next=temp;
            p = p.next;
            start2=start2.next;
        }
        MNode nh=ms.head3.next;

        while(nh!=null)
        {
            System.out.print(nh.key+" ");
            nh=nh.next;
        }
    }
}
