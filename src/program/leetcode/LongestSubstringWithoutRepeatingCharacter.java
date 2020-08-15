package program.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {
    static  int max=0;
    public static void main(String[] args)
    {
        String s="jbpnbwwd";


        int max=findLongest(s);
        int max1=findLongest2(s);

        System.out.println(max1);
    }

    private static int findLongest2(String s) {
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            Set<Character> set=new HashSet<>();
            set.add(s.charAt(i));
            for(int j=i+1;j<s.length();j++)
            {
                if(set.contains(s.charAt(j)))
                {

                        break;

                }else{
                    set.add(s.charAt(j));
                }
            }
            if(max<set.size())
            {
                max=set.size();
            }
        }

        return max;
    }

    private static int findLongest(String s)
   {
        int n=s.length();
        boolean[][] temp=new boolean[n][n];
        int max=0;
        for(int i=0;i<n;i++)
        {
            temp[i][i]=true;
            max=1;
        }
        for(int i=0;i<n-1;i++)
        {
            if(s.charAt(i)!=s.charAt(i+1))
            {
                temp[i][i+1]=true;
                max=2;
            }
        }
        //for the length greater than three
        for(int len=3;len<=n;len++)
        {
            for(int i=0;i<n-len+1;i++)
            {
                int j=i+len-1;
                String q=s.substring(i+1,j);

                if(s.charAt(i)!=s.charAt(j) && temp[i+1][j-1] && q.indexOf(s.charAt(i))==-1
                && q.indexOf(s.charAt(j))==-1)
                {
                    temp[i][j]=true;
                    if(max<len)
                    {
                        max=len;

                    }
                }

            }
        }
        return max;
   }

}
