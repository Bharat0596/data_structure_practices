package program.leetcode;

public class ArrayRotation {

    public  void rotate(int[] nums, int k) {
        int n=nums.length;
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            int index=(i-k%n+n)%n;
            array[index]=nums[i];


        }
        for(int l: array){
            System.out.print(l + "   ");
        }


    }
    /*private  void rotatearray(int[] nums) {
        int n=nums.length;
        int temp=nums[n-1];
        for(int i=n-2;i>=0;i--)
        {
            nums[i+1]=nums[i];
        }
        nums[0]=temp;

    }*/
    public static void main(String[] args)
    {
       int[] nums = {1,2,3,4,5,6,7};
       int k=3;
        ArrayRotation ar=new ArrayRotation();
       ar.rotate(nums,k);
    }
}
