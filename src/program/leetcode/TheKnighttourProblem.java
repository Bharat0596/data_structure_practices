package program.leetcode;

import java.util.ArrayList;
import java.util.List;

public class TheKnighttourProblem {
    public static void main(String[] args)
    {
        int[][] chess=new int[8][8];
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                chess[i][j]=1;
            }
        }

        List<String> list=findPath(chess,0,2);
        for(String s:list)
        {
            System.out.println(s);
        }
    }
    static List<String> paths=new ArrayList<>();
    private static List<String> findPath(int[][] chess,int xc,int yc) {

        if(!isValid(chess,xc,yc))
        {

            return null;
        }
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                System.out.print(chess[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("==========================================");
        System.out.println();
        System.out.println();
        paths.add(xc+"=>"+yc);
        chess[xc][yc]=0;
        findPath(chess,xc+1,yc+2);
        findPath(chess,xc-2,yc+1);
        findPath(chess,xc+2,yc-1);
        findPath(chess,xc+2,yc+1);
        findPath(chess,xc-1,yc+2);
        findPath(chess,xc-1,yc-2);
        findPath(chess,xc-2,yc+1);
        findPath(chess,xc-2,yc-1);

        return paths;
    }

    private static boolean isValid(int[][] chess,int xc, int yc) {
        if(xc<0 || yc<0 || xc>=8 || yc>=8 || chess[xc][yc]==0)
        {
            return false;
        }
        return true;

    }
}
