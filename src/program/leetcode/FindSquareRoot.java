package program.leetcode;

public class FindSquareRoot {
    public static void main(String[] args)
    {
        int x=Integer.MAX_VALUE;
        double p=findRoot(x);
        System.out.println((int)p);
    }

    private static double findRoot(int target) {

       if(target==0 || target==1)
       {
           return target;
       }
       int start=0,end=target,ans=0;
       while(start<=end)
       {
           long mid= start+(end-start)/2;

           if(mid*mid==target)
           {
               return mid;
           }
           if(mid*mid<target)
           {
               start=(int)mid+1;
               ans=(int)mid;
           }else{
               end=(int)mid-1;
           }
       }
       return ans;
    }
}
