package DSAONE;

class A11_sudokuSolver{

//    Here we will fill all the empty space in sudoku



    static boolean isSafe(int[][] board , int row , int col , int num){
        for(int r = 0 ; r < 9 ; r++){
            if(board[r][col] == num) return false;
        }

        for(int c = 0 ; c < 9 ; c++){
            if(board[row][c] == num) return false;
        }

        int rowStart = row - row % 3;
        int colStart = col - col % 3;
        for(int i = rowStart ; i < rowStart + 3 ; i++){
            for(int j = colStart ; j < colStart + 3 ; j++){
                if(board[i][j] == num) return false;
            }
        }

        return true;
    }

    static boolean sudokuSolver(int[][] board){
        int row = -1 , col = -1;
        boolean isComp = true;
        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    isComp = false;
                    break;
                }
            }
            if(!isComp){
                break;
            }
        }

        if(isComp){
            return true;
        }

        for(int num = 1; num <= 9 ; num++){
            if(isSafe(board , row , col , num)){
                board[row][col] = num;
                if(sudokuSolver(board)){
                    return true;
                }else{
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] board = new int[][] {
                { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
        };

        if(sudokuSolver(board)){
            print(board);
        }else{
            System.out.println("No solution possible.");
        }
    }

    static void print(int[][] board){
        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ;j  < 9 ;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

}