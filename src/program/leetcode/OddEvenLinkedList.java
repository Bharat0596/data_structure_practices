package program.leetcode;


import java.util.*;

public class OddEvenLinkedList {
    LNode head;

    public static void main(String[] args)
    {
        OddEvenLinkedList bt=new OddEvenLinkedList();
        bt.head=new LNode(1);
        bt.head.next=new LNode(2);
        bt.head.next.next=new LNode(3);
        bt.head.next.next.next=new LNode(4);
        bt.head.next.next.next.next=new LNode(5);
       // findEvenOdd(bt.head);
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        int p=list.indexOf(1);
        System.out.println(p);



    }

    private static void findEvenOdd(LNode head) {
        LNode start=head;
        LNode list1=new LNode(0);
        LNode list=list1;
        int count=0;
        while(start!=null)
        {
          count++;
          if(count%2!=0)
          {
              list.next=new LNode(start.key);
              list=list.next;

          }
          start=start.next;

        }
        count=0;
        LNode start1=head;
        while(start1!=null)
        {
            count++;
            if(count%2==0)
            {
                list.next=new LNode(start1.key);
                list=list.next;

            }
            start1=start1.next;

        }
        LNode p=list1.next;
        while(p!=null)
        {
            System.out.println(p.key);
            p=p.next;
        }
    }
}
