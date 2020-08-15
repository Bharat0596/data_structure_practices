package program.leetcode;

class LNode
{
    int key;
    LNode next;
    LNode(int key)
    {
        this.key=key;
        next=null;
    }
}
public class DeleteLinkedListNode {
    LNode head;

    public static void main(String[] args)
    {
        DeleteLinkedListNode dl=new DeleteLinkedListNode();
        dl.head=new LNode(1);
      dl.head.next=new LNode(2);
      dl.head.next.next=new LNode(3);
      /* dl.head.next.next.next=new LNode(4);
       dl.head.next.next.next.next=new LNode(5);*/

        //deleteNode(dl.head.next.next.next);
       LNode p= deleteNthNode( dl.head,3);
        display(p);
    }

    private static LNode deleteNthNode(LNode head, int n) {
        LNode first = head;

        LNode start=head;
        int count=0;
        boolean flag=true;
        while(start!=null)
        {

            count++;
            if(count>n+1)
            {
                first=first.next;
                flag=false;

            }
            start=start.next;

        }
        if(count-n+1==1)
        {
            head=first.next;
            return head;
        }
        LNode curr=first;
        LNode nexval = first.next;
        curr.next = nexval.next;
        return  head;


    }

    private static void display(LNode node)
    {
        LNode start=node;
        while(start!=null)
        {
             System.out.print(start.key+" ");
            start=start.next;
        }
    }
    private static void deleteNode(LNode node) {
        LNode curr_node=node;
        LNode next_node=node.next;
        //copying data from next node to current node
        curr_node.key=next_node.key;
        curr_node.next=next_node.next;
    }
}
