package program.leetcode;

public class SearchIn2DMatrix {

    public static void main(String[] args)
    {
       /* int[][] matrix={
                        {1,   4,  7, 11, 15},
                         {2,   5,  8, 12, 19},
                         {3,   6,  9, 16, 22},
                         {10, 13, 14, 17, 24},
                         {18, 21, 23, 26, 30}
                        };*/
        int[][] matrix={{1,1}};
        boolean[][] status=new boolean[matrix.length][matrix[0].length];
        int target=20;

      // searchMatrix(matrix,0,0,target,status);

       //method 2 binary search
        binarySearchMatrix(matrix,target);
        //System.out.println(result);
    }

    private static void binarySearchMatrix(int[][] matrix, int target) {

        boolean flag =binarySearchFor2D(matrix,0,0,matrix.length-1,matrix[0].length-1,target);
        System.out.println(flag);
    }

    private static boolean binarySearchFor2D(int[][] matrix, int rmin, int cmin, int rmax, int cmax, int target) {

        if(rmin>rmax && cmin>cmax)
        {
            return false;
        }
        int rmid=rmin+(rmax-rmin)/2;
        int cmid=cmin+(cmax-cmin)/2;
        if(matrix[rmid][cmid]==target)
        {
            return true;
        }
        if(target<matrix[rmid][cmid])
        {
            return binarySearchFor2D(matrix,rmin,cmin,rmid-1,cmid-1,target);
        }else{
            return binarySearchFor2D(matrix,rmid+1,cmid+1,rmax,cmax,target);
        }
    }

    static boolean result=false;
    private static void searchMatrix(int[][] matrix,int row,int column, int target,boolean[][] status) {

        if(!isValid(matrix,row,column,status))
        {
                return ;
        }
        if(matrix[row][column]==target)
        {
            status[row][column]=true;
            result=true;
            return;
        }
        status[row][column]=true;
        int[] x={0,0,1,-1,1,-1,-1,1};
        int[] y={1,-1,0,0,-1,1,-1,1};
        for(int i=0;i<x.length;i++)
        {
             searchMatrix(matrix,row+x[i],column+y[i],target,status);
        }

    }

    private static boolean isValid(int[][] matrix, int row, int column, boolean[][] status) {

        if(row<0 || row>=matrix.length || column<0 || column>=matrix[0].length || status[row][column]==true )
        {
            return false;
        }
        return true;
    }
}
