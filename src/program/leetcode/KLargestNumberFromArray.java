package program.leetcode;

import java.util.Stack;

public class KLargestNumberFromArray {

    public static void main(String[] args)
    {
        int[] array={9,5,0,1,3,0};
        int k=3;

        int p=findLargest(array,array.length,k);
        System.out.println(p);
    }

    private static int findLargest(int[] array, int n, int k) {
        Stack<Integer> stack=new Stack<>();
        stack.push(array[0]);
        for(int i=1;i<array.length;i++)
        {
            while(!stack.isEmpty() && stack.peek()<array[i] && (k-stack.size())<array.length-i)
            {
                stack.pop();
            }
            if(stack.size() >= k && stack.peek() > array[i]){
                continue;
            }
            stack.push(array[i]);
        }

        double  p=0;
        double res=0;
        double count=0;
        while(!stack.isEmpty())
        {
              p=stack.pop();
              double val=Math.pow(10,count);

                p=p*val;
                res=res+p;
                count++;

        }

        return (int)res;
    }
}
