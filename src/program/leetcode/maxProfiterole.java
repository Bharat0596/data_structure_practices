package program.leetcode;

public class maxProfiterole {
    public static void main(String[] args)
    {
        int[] price={7,1,5,3,6,4};
        int k=maxProfit(price);
        System.out.println(k);
    }

    private static int maxProfit(int[] price) {

        //int[] profit=new int[price.length];

        int max=0;
        for(int i=1;i<price.length;i++)
        {
            if(price[i]>price[i-1])
            {
                max=max+price[i]-price[i-1];


            }
        }
        return max;
    }


}
