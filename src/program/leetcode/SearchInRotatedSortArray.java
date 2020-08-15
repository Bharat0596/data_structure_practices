package program.leetcode;

public class SearchInRotatedSortArray {
    static int midindex=-1;
    public static void main(String[] args)
    {
        int[] array={1,3,5};
        int target=0;

        if(array.length==0)
        {
            System.out.println(-1);
        }
        else if(array.length==1 )
        {
            if( array[0]==target) {
                System.out.println(0);
            }else{
                System.out.println(-1);
            }
        }
        else if(array.length==2 )
        {
            if(array[0]==target)
            {
                System.out.println(0);
            }else if(array[1]==target)
            {
                System.out.println(1);
            }else{
                System.out.println(-1);
            }
        }
        else if(array.length>2) {
             binarySearch(array, 0, array.length-1);
        }
        int k=-1;
        if(midindex!=-1)
        {
            if(array[midindex]>=target && target>=array[0])
            {
                k=binarySearch1(array,0,midindex,target);
            }else{
                k=binarySearch1(array,midindex+1,array.length-1,target);
            }
        }
        else
        {
            k=binarySearch1(array,0,array.length-1,target);
        }
        System.out.println(k);

    }

    private static int binarySearch1(int[] array, int low, int up, int target) {
        if(low>up)
            return -1;
        int mid=low+(up-low)/2;
        if(array[mid]==target)
        {
            return mid;
        }
        if(target<array[mid])
        {
           return binarySearch1(array,low,mid-1,target);
        }else{
            return binarySearch1(array,mid+1,up,target);
        }

    }

    private static void binarySearch(int[] array, int low, int height) {
        if(low>height)
            return ;
        int mid=low+(height-low)/2;
        if(  mid+1<=array.length-1 && array[mid]>array[mid+1]  )
        {
           midindex= mid;
           return ;

        }
        binarySearch(array,low,mid-1);
        binarySearch(array,mid+1,height);


    }
}
