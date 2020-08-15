package program.leetcode;

import java.sql.SQLOutput;

public class PalindromeCheck {

    public static void main(String[] args)
    {
        String s="ab_a";
        System.out.println(ispalindrome(s));
    }

    private static boolean ispalindrome(String s) {

        int i=0,j=s.length()-1;
        while(i<=j)
        {
            if(!isValid(s.charAt(i)))
            {
                i++;
                continue;
            }if(!isValid(s.charAt(j))){
                j--;
                continue;
            }if(!equal(s.charAt(i),s.charAt(j))  )
            {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }

    private static boolean equal(char a, char b) {
        int x=-1,y=-1;
        if(a>='A' && a<='Z')
        {
            x=a-'A';
        } if(a>='a' && a<='z')
        {
            x=a-'a';
        }
        if(b>='A' && b<='Z')
        {
            y=b-'A';
        } if(b>='a' && b<='z')
        {
            y=b-'a';
        } if(a>='0' && a<='9')
        {
            x=a;


        } if(b>='0' && b<='9')
        {
            y=b;
        }
        if(x==y)
            return true;
        return false;

    }

    private static boolean isValid(char c) {
        if((c>='A' && c<='Z')|| (c>='a' && c<='z')||(c>='0' && c<='9'))
            return true;
        return false;
    }

}
