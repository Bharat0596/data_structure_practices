package program.leetcode;

public class LongestCommonPrefix {
    public static void main(String[] args)
    {
        String[] str={"flower","glow","flight"};
        String p=longestCommonPrefix(str);
        System.out.println(p);
    }

    private static String longestCommonPrefix(String[] str) {

        String k=str[0];

        int len=str[0].length();
        String m="";
        for(int p=1;p<str.length;p++)
        {
            if(len>str[p].length())
                len=str[p].length();
        }
        for(int i=0;i<len;i++)
        {
            boolean flag=true;
            for(int j=1;j<str.length;j++)
            {

                if(k.charAt(i)!=str[j].charAt(i))
                {
                    flag=false;
                    break;
                }
            }
            if(flag) {
                m = m + k.charAt(i);
            }else {
                break;
            }

        }
        return m;
    }
}
