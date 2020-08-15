package program.leetcode;

public class ImplementStrstr {

    public static void main(String[] args)
    {
       String haystack = "mississippi" ,needle = "";
        System.out.println(haystack.indexOf(needle));
      // int k=strStr(haystack,needle);
        //System.out.println(k);
    }
    public static int strStr(String haystack, String needle)
    {
        if(needle.isEmpty() )
            return 0;
        if(needle.length()>haystack.length())
            return -1;
        int n=needle.length();
        boolean flag=false;
        char c=needle.charAt(0);
        int index=-1;
        for(int i=0;i<haystack.length();i++)
        {
            if(haystack.charAt(i)==c)
            {

                if(i+n<=haystack.length() && haystack.substring(i,i+n).equals(needle)) {
                    index=i;
                    flag = true;
                    break;
                }
            }
        }

        if(flag )
            return index;
        else
            return -1;

    }


}
