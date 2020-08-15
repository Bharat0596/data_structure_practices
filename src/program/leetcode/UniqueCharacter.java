package program.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueCharacter {
    public static void main(String[] args)
    {
        String s="aaaz";

        System.out.println(findUniqueindex(s));
    }
    private static int findUniqueindex(String s)
    {
        int[] array=new int[26];
        for(int i=0;i<s.length();i++)
        {
            int k=(int)s.charAt(i);
            array[k-97]=array[k-97]+1;
        }
        int ans=-1;
        for(int j=0;j<s.length();j++)
        {
            int p=(int)s.charAt(j);
            if(array[p-97]==1)
            {
                ans=j;
                break;
            }
        }
        return ans;
    }
}
