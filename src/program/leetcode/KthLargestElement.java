package program.leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElement {
    public static void main(String[] args)
    {
        int[] array={3,2,1,5,6,4};
        int p=findKth(array, 3);
        System.out.println(p);
    }


    private static int findKth(int[] array, int k) {

       Arrays.sort(array);
       return array[array.length-k];
    }
}
