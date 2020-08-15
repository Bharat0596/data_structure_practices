package program.leetcode;

public class NQueenproblems {
    static  final int queen=4;
    public static void main(String[] args)
    {
        int[][] chess=new int[4][4];
        boolean flag=findSol(chess,0);

    }

    private static void display(int[][] sol) {
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
    }


    private static boolean findSol(int[][] chess,int col) {
        if(col>=queen) {
            display(chess);
            return true;
        }
        for(int i=0;i<queen;i++)
        {
            if(isSafe(chess,i,col))
            {
                chess[i][col]=1;
                if(findSol(chess,col+1))
                    return true;
                chess[i][col]=0;
            }

        }
        return false;
    }

    private static boolean isSafe(int[][] chess, int row, int col) {

        for(int i=0;i<col;i++)
        {
            if(chess[row][i]==1)
            {
                return false;
            }
        }
        for(int i=row, j=col;i>=0 && j>=0 ;i--,j--)
        {
            if(chess[i][j]==1)
                return false;
        }
        for(int i=row, j=col;i<4 && j>=0 ;i++,j--)
        {
            if(chess[i][j]==1)
                return false;
        }
        return true;
    }
}
