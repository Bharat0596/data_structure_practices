package program.leetcode;

public class SortColors {
    public static void main(String[] args)
    {
        int[] array={2,0,2,1,0,1,2,0,1,1,1,0};
        sortColors(array,array.length-1);
    }


    private static void sortColors(int[] array, int n) {

        int lo=0;
        int up=n;
        int mid=0;
        while(mid<=up)
        {
            switch (array[mid])
            {
                case 0 : int temp=array[lo];
                array[lo]=array[mid];
                array[mid]=temp;
                lo++;
                mid++;break;

                case 1: mid++;
                break;

                case 2: int temp1=array[up];
                        array[up]=array[mid];
                        array[mid]=temp1;
                        up--;
                        break;

            }
        }
        for(int i=0;i<=n;i++)
        {
            System.out.print(array[i]+"  ");;
        }

    }
}
