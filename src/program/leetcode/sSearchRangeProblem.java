package program.leetcode;

public class sSearchRangeProblem {
    static int[] temp={-1,-1};
    public static void main(String[] args)
    {
        int[] nums={0,0,0,1,2,3};

        int target=0;
        binarySearch(nums,0,nums.length-1,target);
        System.out.println(temp[0]+"=="+temp[1]);
    }
    public static void binarySearch(int[] nums,int low,int up,int target)
    {
        if(low>up)
        {
            return ;
        }
        int mid=low+(up-low)/2;
        if(nums[mid]==target)
        {
            int b=mid;
            int f=mid;
            while(b>=0 && nums[b]==target)
            {
                b--;
            }
            while(f<nums.length -1 && nums[f]==target )
            {
                f++;
            }
            temp[0]=b+1;
            temp[1]=f-1;
            return ;
        }
        else if(nums[mid]>target)
        {
            binarySearch(nums,low,mid-1,target);
        }else{
            binarySearch(nums,mid+1,up,target);
        }
    }
}
