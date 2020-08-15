package program.leetcode;

import javax.swing.plaf.IconUIResource;
import java.util.*;


public class TopKFrequentElement {
    public static void main(String[] args)
    {
        int[] array={1,2,2,3,3,3};
        int k=2;
        int[] temp=findElement(array,k);
        for(int i=0;i<temp.length;i++)
        {
            System.out.print(temp[i]+" ");
        }
    }

    private static int[] findElement(int[] array, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<array.length;i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }
        Queue<Integer> heap=new PriorityQueue<>((n1,n2)->map.get(n2)-map.get(n1));
        int[] temp=new int[k];
        for(Integer i:map.keySet())
        {
            heap.add(i);
        }
        int count=0;
        while (!heap.isEmpty())
        {
            if(count<k)
            {
                temp[count++]=heap.poll();
            }else {
                heap.poll();
            }
            //System.out.println(heap.poll());
        }
        return temp;
    }
}
