package program.leetcode;

public class DivideInteger {
    public static void main(String[] args)
    {
        long p=divide(-2147483648,2);
        System.out.println(p);
    }

    static int count=0;
    private static long divide(int dividend, int divisor) {
        int sign=((dividend <0) ^ (divisor <0))?-1:1;


        long ldividend=Math.abs((long)dividend);
       long  ldivisor=Math.abs((long)divisor);
       if(ldividend==0 || ldividend<ldividend)
       {
           return 0;
       }
       if(ldivisor==1)
       {
           return ldividend;
       }
       if(ldivisor==0)
       {
           return Integer.MAX_VALUE;
       }
       while(ldividend>=ldivisor)
        {
            ldividend-=ldivisor;
            count++;
        }

        return sign*count;
    }

    private static void findQuotient(int dividend, int divisor) {
        while(dividend>divisor)
        {
            count++;
            dividend-=divisor;
        }
    }
}
