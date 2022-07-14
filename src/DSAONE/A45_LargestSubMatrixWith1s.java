package DSAONE;
import static DSAONE.A44_MaxAreaOfHistogram.findMaximum;

//Find largest area submatrix with all 1s in it.
//Here we one by one take each row and calculate the maxsum so far using maxHistogram function
//Time - O(n^2)
//Space - O(n)

public class A45_LargestSubMatrixWith1s {

    public static int largestSubMatrix(int[][] arr){
        int[] currRow = arr[0];
        int maxAns = findMaximum(currRow);
        for(int i = 1; i < arr.length ; i++){
            for(int j = 0 ; j < arr.length ; j++){
                if(arr[i][j] == 1){
                    currRow[j]++;
                }else{
                    currRow[j] = 0;
                }
            }
            int ans  = findMaximum(currRow);
            maxAns = Math.max(ans , maxAns);
        }
        return maxAns;
    }

    public static void main(String[] args) {
        int[][] arr = {{0,1,1,1,1,0} , {1,1,1,1,0,1} , {1,1,0,1,1,1} , {1,1,1,1,1,0}};

        int res = largestSubMatrix(arr);
        System.out.println(res);
    }
}
