package program.leetcode;

public class ReverseInteger {
    public static void main(String[] args)
    {

        int k=-12345;
        System.out.println(reverse(k));
    }
    private static int reverse(int k)
    {
        boolean flag=false;
        int val=-1;
        if(k<0)
        {
         k=k*val;
         flag=true;
        }
        int sum=0;
        int prev=0;
        while(k!=0)
        {
            int curr=k%10;
            sum=sum*10+curr;
            if(prev!=(sum-curr)/10)
                return 0;
            prev=sum;
            k=k/10;

        }
        if(flag)
        {
            sum=sum*val;
        }
            return sum;
    }
}
