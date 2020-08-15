package program.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationProblem {
    public static void main(String[] args)
    {
        String[] Letters={"0","1","abc","def","ghi","jkl","mnp","pqrs","tuv","wxyz"};
        String digits="234";
        List<String> result=new ArrayList<>();
       findCombinations(result,Letters,digits,"",0);
       for(String i:result)
       {
           System.out.print(i+"  ");
       }

    }

    private static void findCombinations(List<String> result, String[] letters, String digits,
                                         String output, int index)
    {
        if(index==digits.length())
        {
            result.add(output);
            return ;

        }
        String s=letters[digits.charAt(index)-'0'];
        for(int i=0;i<s.length();i++)
        {
            findCombinations(result,letters,digits,output+s.charAt(i),index+1);
        }


    }
}
