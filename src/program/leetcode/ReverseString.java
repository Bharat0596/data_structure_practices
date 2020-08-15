package program.leetcode;

public class ReverseString {
    public static void main(String[] args)
    {
        char[] array={'h','e','l','k','l','o'};
        int low=0;
        int up=array.length-1;
        while(low<=up)
        {
            char temp=array[low];
            array[low]=array[up];
            array[up]=temp;
            low++;
            up--;
        }
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+"  ");
        }
    }
}
