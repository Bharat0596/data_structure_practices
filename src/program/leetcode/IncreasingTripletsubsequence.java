package program.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IncreasingTripletsubsequence {
    public static void main(String[] args)
    {
        int[] array={2,5,3,4,5};
        boolean flag=increasingTriplet(array);
        Set<Integer> set= new HashSet<>();
        System.out.println(flag);
    }

    private static boolean increasingTriplet(int[] array) {
        int max=Integer.MAX_VALUE;
        int min=Integer.MAX_VALUE;
        int i=0;
        for( i=0;i<array.length;i++)
        {
          if(array[i]<=min)
          {
              min=array[i];
          }else if(array[i]<=max)
          {
              max=array[i];
          }else
              break;
        }
        if(i==array.length)
        {
            return  false;
        }
        return true;

    }
}
