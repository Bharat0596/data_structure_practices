package program.leetcode;

public class LongestPalindromicSequence {

    public static void main(String[] args)
    {
        String s="abcabcbb";

        int k=LongestPalindrome(s);
        System.out.println(k);
    }

    private static int LongestPalindrome(String s) {
        int n=s.length();
        boolean[][] table=new boolean[n][n];
        int max=0;
        int start=0;
        String p="";
        for(int i=0;i<n;i++)
        {
            table[i][i]=true;
            start=i;
            max=1;
        }
        for(int i=0;i<n-1;i++)
        {
            if(s.charAt(i)!=s.charAt(i+1))
            {
                table[i][i+1]=true;
                start=i;
                max=2;
            }
        }
        for(int len=3;len<=n;len++)
        {
            for(int i=0;i<n-len+1;i++)
            {
                int j=i+len-1;
                if(s.charAt(i)==s.charAt(j) && table[i+1][j-1])
                {
                    table[i][j]=true;
                    if(max<len)
                    {
                        max=len;
                       start=i;
                    }
                }
            }
        }
        System.out.println(s.substring(start,start+max-1));
        return max;
    }
}
