package program.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class sumTwo {
    public static void main(String[] args)
    {
        int[] array={3,2,4};
        int target=6;
        int[] temp=findIndeces(array,target);
    }

    private static int[] findIndeces(int[] array, int target) {
       Map<Integer,Integer> hs=new HashMap<>();
       for(int i=0;i<array.length;i++)
       {
           if(array[i]>=target)
           {
               int complement=target-array[i];
               if(!hs.containsKey(array[i]))
               {
                   hs.put(complement,i);
               }else{
                   return new int[] {hs.get(complement),i};

               }
           }
       }

        return new int[] {};
    }
}
