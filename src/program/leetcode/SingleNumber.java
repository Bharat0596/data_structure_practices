package program.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
       Map<Integer,Integer> map=new HashMap<Integer,Integer>();
       int k=0;
       for(int i=0;i<nums.length;i++)
       {
           if(map.containsKey(nums[i]))
           {
               map.put(nums[i],map.get(nums[i])+1);
           }else
           {
               map.put(nums[i],1);
           }

       }
       for(Map.Entry<Integer,Integer> i:map.entrySet())
       {
           if(i.getValue()==1)
           {
               k=i.getKey();
           }
       }
        return k;
    }
    private static int singleNumber1(int[] array) {
        //1 1 2 2 4
        Arrays.sort(array);
        for(int i=0;i<array.length && i +1 < array.length;)
        {
            if(array[i]!=array[i+1]) {
                return array[i];
            }else{
                i+=2;
            }
        }
        return array[array.length-1];

    }
    public static void main(String[] args)
    {
        int[] array={4,1,2,1,2};
        //int v=singleNumber(array);
        int k=singleNumber1(array);
        System.out.println("value="+k);
        //System.out.println(v);
    }


}
