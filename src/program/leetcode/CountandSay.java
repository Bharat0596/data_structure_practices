package program.leetcode;

public class CountandSay {
    public static void main(String[] args)
    {
        int n=4;
        String s=countAndSay(n);
        System.out.println(s);

    }

    private static String countAndSay(int n) {
        String s="1";

        for(int i=2;i<=n;i++)
        {
             s=findCount(s);
            //System.out.println(s);
        }
        return s;

    }

    private static String findCount(String s) {

        int count=0;
        String q="";
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                count++;
            }else{
                count++;
                q=q+count+s.charAt(i);
                count=0;
            }
        }
        q=q+ ++count+s.charAt(s.length()-1);
        return q;
    }
}
