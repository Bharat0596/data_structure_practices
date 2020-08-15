package program.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args)
    {
        char[][] array ={
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'} };
        char[][] array1={{'8','3','.','.','7','.','.','.','.'},
        {'6','.','.','1','9','5','.','.','.'},
        {'.','9','8','.','.','.','.','6','.'},
        {'8','.','.','.','6','.','.','.','3'},
        {'4','.','.','8','.','3','.','.','1'},
        {'7','.','.','.','2','.','.','.','6'},
        {'.','6','.','.','.','.','2','8','.'},
        {'.','.','.','4','1','9','.','.','5'},
        {'.','.','.','.','8','.','.','7','9'}};
        boolean flag=validateSudoku(array);
        System.out.println(flag);
    }
    private static boolean validateSudoku(char[][] array)
    {
        Set<String> set=new HashSet<String>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char val=array[i][j];
                if(val!='.')
                {
                    if(!set.add(val+"row"+i)|| !set.add(val+"columns"+j)||
                            !set.add(val+"box"+i/3+"=="+j/3))
                    {
                        return false;

                    }

                }
            }
        }
        return true;
    }
}
