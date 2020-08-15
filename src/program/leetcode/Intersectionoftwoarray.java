package program.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intersectionoftwoarray {
    public static void main(String[] args)
    {
        int[] nums1={2,1};
        int[] nums2={1,2,3};
       // int[] b= intersect(nums1,nums2);
        int[] arr;
        if(nums1.length > nums2.length){
            arr=intersect1(nums2,nums1);
        }else{
            arr=intersect1(nums1,nums2);
        }

       Display(arr);
    }

    private static void Display(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }

    private static int[] intersect1(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        List<Integer> set=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        //Vector<Integer> b=new Vector<Integer>();
       
        for(int i=0;i<n2;i++)
        {
            set.add(nums2[i]);
        }
        for(int i=0;i<n1;i++)
        {
            if(set.contains(nums1[i]))
            {
                list.add(nums1[i]);
                set.remove(set.indexOf(nums1[i]));
            }
        }
        int[] m=list.stream().mapToInt(Integer :: intValue).toArray();
        return m;
    }

}
