class Solution {

    public boolean isValid(char board[][],int row,int col,char c){
        for(int i=0;i<9;i++){
            if(board[row][i] == c){
                return false;
            }
            if(board[i][col] == c){
                return false;
            }
            if(board[3*(row/3)+i/3][3*(col/3)+i%3] == c){
                return false;
            }
        }
        return true;
    }

    public boolean solve(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.'){
                    for(int k=1;k<=9;k++){
                        char c = (char) (k+'0');
                        if(isValid(board,i,j,c)){
                            board[i][j] = c;

                            if(solve(board)){
                                return true;
                            }
                            else{
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void solveSudoku(char[][] board) {
        solve(board);
    }
}