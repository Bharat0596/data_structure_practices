package program.leetcode;

public class findPeakElement {


    public static void main(String[] args)
    {
        int[] nums={2,1};
        int k=findPeak(nums);
        System.out.println(k);

    }
    static int result=-1;
    private static int findPeak(int[] nums)
    {
        if(nums.length==1)
            return 0;
        int n=binarySearch(nums,0,nums.length-1);

        if(n==-1)
        {
            if(nums[0]>nums[1])
            {
                result=0;
            }else{
                result =nums.length-1;
            }
        }

        return result;
    }

    private static int binarySearch(int[] array, int low, int up) {

        if(low>up)
        {
            return result;
        }
        int mid=low+(up-low)/2;

        if(mid-1>=0 && mid+1<=array.length-1 && array[mid]>=array[mid-1] && array[mid]>=array[mid+1])
        {
            result= mid;
        }
         binarySearch(array,low,mid-1);
         binarySearch(array,mid+1,up);
       return result;

    }
}
