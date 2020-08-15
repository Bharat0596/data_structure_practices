package program.leetcode;

public class StringToIntegterProblem {

    public static void main(String[] args) {
        String str = "-91283472332";

        int k = myAtoi(str);
        System.out.println(k);
    }

    private static int myAtoi(String str) {

        boolean flag=false;
        boolean isNegative=false;
        int low=0;
        str=str.trim();
        for(int i=0;i<str.length();i++)
        {
           /* if(str.charAt(i)==' ')
                continue;*/
            if(isValid(str.charAt(i)))
            {
               if(str.charAt(i)=='+' || str.charAt(i)=='-')
               {
                   char p=str.charAt(i);
                   if(p=='-')
                   {
                       isNegative=true;
                   }
                   low=i+1;
                   flag=true;
                   break;
               }
               low=i;
               break;
            }else{
                return 0;
            }
        }
        double sum=0;
        int prev=0;
        for(int k=low;k<str.length();k++)
        {
            char l=str.charAt(k);
            if(l>='0' && l<='9') {
                int digit=l-'0';
                prev=(int)sum;
                 sum = sum * 10 +digit;



            }
            else
                break;
        }
        if(isNegative)
        {
            sum=-sum;
        }
        if(sum>Integer.MAX_VALUE)
        {
            return Integer.MAX_VALUE;
        }else if(sum<Integer.MIN_VALUE)
        {
            return Integer.MIN_VALUE;
        }else
            return   (int)sum;

    }

    private static boolean isValid(char c) {
        if((c>='0' && c<='9') || c=='+'|| c=='-' || c=='+')
            return true;
        return false;
    }
}
