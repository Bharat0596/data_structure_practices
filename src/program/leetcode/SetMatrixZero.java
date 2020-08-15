package program.leetcode;

public class SetMatrixZero {
    public static void main(String[] args)
    {
        int[][] array={{1,0,3}};
        int[][] p=setZero(array);
        System.out.println();
    }

    private static int[][] setZero(int[][] array)
    {

        int row=array.length;
        int col=array[0].length;
        boolean first_row=false,firstcol=false;

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(array[i][j]==0)
                {
                    if(i==0) {
                        first_row = true;
                    }
                    if(j==0){
                        firstcol=true;
                    }
                    array[0][j]=0;
                    array[i][0]=0;
                }
            }
        }
        for(int i=1;i<row;i++)
        {
            for(int j=1;j<col;j++)
            {
                if(array[0][j]==0 || array[i][0]==0)
                {
                    array[i][j]=0;
                }
            }
        }
        if(first_row)
        {
            for(int i=0;i<col;i++)
            {
                array[0][i]=0;
            }
        }
        if(firstcol)
        {
            for(int j=0;j<row;j++)
            {
                array[j][0]=0;
            }
        }




        Display(array);
        return array;
    }

    private static void Display(int[][] array) {
        for(int i=0;i<array.length;i++)
        {
           for(int j=0;j<array[0].length;j++)
           {
               System.out.print(array[i][j]+" ");
           }
            System.out.println();
        }
    }
}
