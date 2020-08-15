package program.leetcode;

public class WordSearchProblem {
    public static void main(String[] args) {
        char[][] board={{'A','B','C','E'},
                        {'S','F','C','S'},
                        {'A','D','E','E'}
                        };
        String word="ABCCED";
        boolean flag=false;
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0))
                {
                    flag=wordSearch(board,word,i,j,-1);
                    if(flag){
                        break;
                    }
                }
            }
            if(flag){
                break;
            }
        }

        System.out.println(flag);
    }

    private static boolean wordSearch(char[][] board, String word,int xc,int yc,int index) {

         index++;
        if(!isValid(board,xc,yc, word, index))
        {
            return false;
        }

        if(index == word.length()-1 ){
            return true;
        }

        char t = board[xc][yc];
        board[xc][yc]='#';
        if(wordSearch(board,word,xc+1,yc,index) || wordSearch(board,word,xc-1,yc,index) ||
                wordSearch(board,word,xc,yc+1,index) || wordSearch(board,word,xc,yc-1,index)) {
            return true;
        }
        board[xc][yc] = t;


        return false;
    }

    private static boolean isValid(char[][] board, int xc, int yc, String word, int index) {

        if(xc<0 || yc<0 || xc>=board.length || yc>=board[0].length ||
                    board[xc][yc]=='#'  ||index >= word.length() || word.charAt(index) != board[xc][yc])
        {
            return false;
        }

        return true;
    }
}