package program.leetcode;

import java.util.HashSet;
import java.util.Set;

class CNode
{
    int val;
    CNode next;
    CNode(int val)
    {
        this.val=val;
    }
}
public class CycleinLinkedList {
    CNode head;
    public static void main(String[] args)
    {
        CycleinLinkedList cl=new CycleinLinkedList();

        cl.head=new CNode(1);
        cl.head.next=new CNode(2);
        cl.head.next.next=new CNode(3);
        cl.head.next.next.next=new CNode(4);
        //cl.head.next.next.next.next=cl.head.next;
        boolean flag=hasCycle(cl.head);
        if(flag)
        {
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }

    private static boolean hasCycle(CNode head) {

        Set<CNode> set=new HashSet<CNode>();
        CNode start=head;
        while(start!=null)
        {
            if(!set.contains(start))
            {
                set.add(start);
            }else{
                return true;
            }
            start=start.next;
        }
        return false;
    }

}
