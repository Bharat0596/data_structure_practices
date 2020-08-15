package program.leetcode;

import java.util.*;

public class ThreeSumProblem {
    public static void main(String[] args)
    {
        int[] array={-1, 0, 1, 2, -1, -4};

        List<List<Integer>> list=threeSum(array);
        System.out.println(list);
    }

    private static List<List<Integer>> threeSum(int[] array) {
        int target=0;
        List<List<Integer>> list1=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        Set<String> set1=new HashSet<>();
        for(int i=0;i<array.length;i++)
        {
            int current=target-array[i];
           // List<Integer> list=new ArrayList<>();

            for(int j=i+1;j<array.length;j++)
            {
                List<Integer>  list=new ArrayList<>();
                int complement=current-array[j];
                if(!set.contains(complement))
                {
                    set.add(array[j]);
                }else{
                    int first = array[i];
                    int second = complement;
                    int third = array[j];

                   int[] a = {first, second, third};
                   Arrays.sort(a);
                   String key = a[0] + "_" + a[1] + "_" + a[2];
                   if(!set1.contains(key)){
                       set1.add(key);
                       list.add(array[i]);
                       list.add(complement);
                       list.add(array[j]);
                       list1.add(list);
                   }



                }
            }

        }
        return list1;
    }
}
