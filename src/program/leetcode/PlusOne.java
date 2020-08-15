package program.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class PlusOne {
    public static void main(String[] args)
    {
        int[] array={1,9,9};
        Vector<Integer> set=new Vector<Integer>();
        for(int i=0;i<array.length;i++)
        {
            set.add(array[i]);
        }
        int[] p=plusOne(set);
       // int[] p1=plusOne1(array);
        for(int i=0;i<p.length;i++)
        {
            System.out.println(p[i]);
        }
    }

    private static int[] plusOne1(int[] set) {
       int[] temp;

       boolean flag=true;
       for(int i=0;i<set.length;i++)
       {
           if(set[i]<9) {
               flag = false;
               break;
           }
       }
        if(flag)
        {
            temp=new int[set.length+1];
        }else{
            temp=new int[set.length];
        }
        int p=(set[set.length-1]+1)%10;
        int carry=(set[set.length-1]+1)/10;
        set[set.length-1]=p;

        for(int i=set.length-2;i>=0;i--)
        {
            if(carry==1) {
                carry = (set[i] + carry) / 10;
                set[i] = (set[i] + 1) % 10;

            }
        }
        if(carry==1)
            set[0]+=carry;

        if(flag )
        {
            temp[0]=1;
            for(int i=1;i<=set.length;i++ )
            {
                temp[i]=set[i];
            }
        }else{
            temp=set;
        }
        return temp;
    }

    private static int[] plusOne(Vector<Integer> arr) {

        int n=arr.size();
        int carry=1;
        arr.set(n-1,arr.get(n-1)+carry);
        carry=arr.get(n-1)/10;
        int p=arr.get(n-1)%10;
        arr.set(n-1,p);

          for(int i=n-2;i>=0;i--)
            {
                if(carry==1) {
                    arr.set(i, arr.get(i) + carry);
                    carry = arr.get(i) / 10;
                    int p1 = arr.get(i) % 10;
                    arr.set(i, p1);
                }
            }

        if(carry==1)
            arr.add(0,carry);

            int[] o=arr.stream().mapToInt(Integer :: intValue).toArray();
            return o;
    }
}
