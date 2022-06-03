package DSAONE;

//Here we are given a 2D array or matrix and we have to find no. of ways to reach bottom right from top left
//Here we use recursion to find total paths
public class A9_noOfPathMatrix {
    //----------------------------------------------------------------------------------------------------
    static int countPath(int[][] arr ,int n ,int m){
        // If either row or column is equal to 1 then it is a linear matrix and hence have only 1 path.
        // Hence it's the base case which return 1;
        if(n == 1 || m == 1){
            return 1;
        }

        // Generalized relation to break problem into sub-problems
        return countPath(arr , n- 1 , m) + countPath(arr , n , m-1);
    }
    //-----------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

        System.out.println(countPath(array , array.length , array[0].length));
//        print(array);
    }
    static void print(int[][] array){
        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array[i].length ; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
