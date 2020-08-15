package program.leetcode;

public class FactorialTrailingZerosProblem {
    public static void main(String[] args)
    {

        int result = findTrailingZeroes(1808548329);
        System.out.println(result);
    }

    private static int findTrailingZeroes(int n) {
        int count=0;
        while(n>0)
        {
            n=n/5;
            count+=n;
        }
        return count;
    }

    private static long fact(int result) {
        if(result<=1)
            return 1;
        return result*fact(result-1);
    }

    static int count2=0;
    static int count5=0;
    private static String findPrimefactors(int n) {

        if(n<=1)
        {
            return null;
        }
       String s="";
        int count=2;
       while(n!=1)
       {
           if(n%count==0)
           {
               n=n/count;
               if(count==2)
               {
                   count2++;
               }
               else if(count==5)
               {
                   count5++;
               }
               s=s+count+"x";
           }else{
               count++;
           }
       }
       return s;
    }

}
