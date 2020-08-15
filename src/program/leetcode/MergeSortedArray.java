package program.leetcode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args)
    {
        int[] nums1={1,2,3,7,0,0,0};
        int[] nums2={2,5,6};
        int m=nums1.length;
        int n=nums2.length;
        //merge(nums1,m,nums2,n);
        merge2(nums1,4,nums2,n);
    }
    private static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int[] temp1=new int[m];
        for(int k=0;k<m;k++)
        {
            temp1[k]=nums1[k];
        }
        int i=0,j=0,count=0;
        while(i<m && j<n)
        {
            if(temp1[i]<=nums2[j])
            {
                nums1[count++]=temp1[i];
                i++;
            }else{
                nums1[count++]=nums2[j++];
            }
        }
        while(j<n)
        {
            nums1[count++]=nums2[j++];
        }
        while(i<m)
        {
            nums1[count++]=temp1[i++];
        }

    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp=new int[m+n];
        int i=0,j=0,count=0;
        while(i<m && j<n) {
            if (nums1[i] <= nums2[j]) {
                temp[count] = nums1[i];
                i++;
                count++;
            } else {
                temp[count++] = nums2[j];
                j++;
            }
        }
        while(i<m)
        {
            temp[count++]=nums1[i++];
        }while(j<n){
            temp[count++]=nums2[j++];
        }

    }
}
