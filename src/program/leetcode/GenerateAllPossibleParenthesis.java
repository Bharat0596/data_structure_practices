package program.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllPossibleParenthesis {
     static List<List<String>>list1=new ArrayList<>();
    public static void main(String[] args)
    {


        int n=3;
        String[] list=new String[2*n];
        parenthesis(0,n,list,0,0);
    }

    private static void parenthesis( int pos,int n, String[] list, int open, int close) {
        if(close==n)
        {
            String p="";
           for(int i=0;i<pos;i++)
           {
               System.out.print(list[i]);
           }
            System.out.println();

            return;
        }

            if(open>close)
            {
                list[pos]=")";
                parenthesis(pos+1,n,list,open,close+1);
            }
            if(open<n)
            {
                list[pos]="(";
                parenthesis(pos+1,n,list,open+1,close);
            }

    }


}
