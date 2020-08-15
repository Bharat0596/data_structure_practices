package program.leetcode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args)
    {
        int[] array={1,1,1,2,2,2,3,3,3,4,4};
        int val=removeDuplicates(array);
        for(int i=0;i<val;i++)
        {
            System.out.println(array[i]);
        }

    }

    private static int removeDuplicates(int[] array) {
        Set<Integer> set=new HashSet<>();
        int n=0;
        for(int i=0;i<array.length;i++)
        {
            if(!set.contains(array[i]))
            {
                set.add(array[i]);
                array[i-n]=array[i];
            }
            else
            {
                n++;
            }
        }
        return  array.length;
    }
}
