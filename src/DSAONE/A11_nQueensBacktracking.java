package DSAONE;
// Here in nQueen problem we have a chess board of N * N size and we have to arrange N queens in this board such
// that all the queens are safe i.e.,
// There is no queen adjacent to other queen - horizontally , vertically , diagonally.,
public class A11_nQueensBacktracking {
    static int N = 3;

    static boolean nQueen(int[][] board , int row){
        if(row == N) return true;

        for(int col = 0 ; col < N ; col++){
            if(isSafe(board , row , col)){
                board[row][col] = 1;
                if(nQueen(board , row+1)){
                    return true;
                }
                board[row][col] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int i ,j;
        int[][] board = new int[N][N];
        for(i = 0 ; i < N ; i++){
            for(j = 0 ; j < N ; j++){
                board[i][j] = 0;
            }
        }
        if(nQueen(board , 0)){
            printBoard(board);
        }else{
            System.out.println("Sorry the Queens cant be arranged in this board");
        }
    }

    static boolean isSafe(int[][] arr , int row , int col){
        int i , j;
        for(i = 0 ; i < row ; i++){
            if(arr[i][col] == 1) return false;
        }
        for(j = 0 ; j < col ; j++){
            if(arr[row][col] == 1) return false;
        }
        for(i = row + 1 ; i < N ; i++){
            if(arr[i][col] == 1) return false;
        }
        for(j = col + 1 ; j < N ; j++){
            if(arr[row][j] == 1) return false;
        }
        for(i = 0, j = 0 ; i < row && j < row ; i++ , j++){
            if(arr[i][j] == 1) return false;
        }
        for(i = row+1 , j = col+1 ; i < N && j < N ; i++ , j++){
            if(arr[i][j] == 1) return false;
        }
        for(i = 0 , j = N-1 ; i < row && j > col ; i++ , j--){
            if(arr[i][j] == 1) return false;
        }
        for(i = N-1 , j = 0 ; i > row && j < col ; i-- , j++){
            if(arr[i][j] == 1) return false;
        }
        return true;
    }

    static void printBoard(int[][] arr){
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}