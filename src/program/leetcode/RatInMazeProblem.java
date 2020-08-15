package program.leetcode;

public class RatInMazeProblem {
    public static void main(String[] args)
    {
        int[][] maze={ { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };
       /* for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                maze[i][j]=1;
            }
        }*/
        int[][] sol=new int[4][4];
        boolean res=findPath(maze,0,0,sol);
        display(sol);
    }


    private static boolean findPath(int[][] maze, int sx, int sy,int[][] sol) {

        if(sx== maze.length-1 && sy==maze[0].length-1 && maze[sx][sy]==1)
        {
            sol[sx][sy]=1;
            return  true;
        }
        if(isValid(maze,sx,sy))
        {
            sol[sx][sy]=1;
           if(findPath(maze,sx+1,sy,sol))
           {
               return true;
           }
           if(findPath(maze,sx,sy+1,sol))
           {
               return true;
           }
           sol[sx][sy]=0;
           return false;

        }else{
            return  false;
        }


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

    private static boolean isValid(int[][] maze, int sx, int sy) {
        if(sx<0 || sy<0 || sx>=4 || sy>=4 || maze[sx][sy]==0 )
        {
            return false;
        }
        return true;
    }
}
