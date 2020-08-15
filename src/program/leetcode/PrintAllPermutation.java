package program.leetcode;

import java.util.*;

public class PrintAllPermutation {
    static Set<String> set=new HashSet<>();
    public static void main(String[] args)
    {
        int[] array={1,2,3};
        System.out.println(array);
        String input="";
        for(int i=0;i<array.length;i++)
        {
            input+=array[i];
        }
       // System.out.println(input);
        permuatation(array,array.length);
        permutationMethod2(array,0,array.length-1);
        System.out.println(result);
    }

    static  List<List<Integer>> result=new ArrayList<>();

    private static void permutationMethod2(int[] array, int l, int r) {
        if(l==r)
        {
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<array.length;i++)
            {
                list.add(array[i]);
            }
            result.add(list);
            return;

        }
        for(int i=l;i<=r;i++)
        {
            swap(array,l,i);
            permutationMethod2(array,l+1,r);
            swap(array,l,i);

        }
    }

    private static void swap(int[] array, int l, int i) {
        int temp=array[l];
        array[l]=array[i];
        array[i]=temp;
    }

    private static void permuatation(int[] array, int n) {

        String input="";
        if(n==1)
        {

            for(int i=0;i<array.length;i++)
            {
                input+=array[i];
            }
            System.out.println(input);
            return;
        }else{
            for(int i=0;i<n-1;i++)
            {
                permuatation(array,n-1);
                if(i%2==0)
                {
                    int temp=array[i];
                    array[i]=array[n-1];
                    array[n-1]=temp;
                }else{
                    int temp=array[0];
                    array[0]=array[n-1];
                    array[n-1]=temp;
                }
            }
            permuatation(array,n-1);
        }
    }
}
