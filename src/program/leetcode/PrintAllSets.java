package program.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSets {
    public static void main(String[] args)
    {
        int[] array={1,2};
        List<Integer> temp=new ArrayList<>();
        List<List<Integer>> list=new ArrayList<>();
        list=generateAllSets(0,list,temp,array, array.length);
        System.out.println(list);
    }

    private static List<List<Integer>> generateAllSets(int index, List<List<Integer>> list,
                                                       List<Integer> temp, int[] array, int n) {
        list.add(new ArrayList<>(temp));

        for(int i=index;i<n;i++)
        {
            temp.add(array[i]);
            generateAllSets(i+1,list,temp,array,n);
            temp.remove(temp.size()-1);
        }

        return list;
    }
}
