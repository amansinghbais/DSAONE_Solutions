package DSAONE;
// Find the subarray with maximum sum
//Kadanes algorithm
public class A13_largestSumSubArray {
    public static void main(String[] args) {
        int[] arr = {1 , - 2, 3 , 2 , -6 , 4};

        int currSum = 0 , maxSum = 0;

        for(int i = 0 ; i < arr.length  ; i++){
            currSum += arr[i];

            if(currSum > maxSum){
                maxSum = currSum;
            }

            if(currSum < 0) {
                currSum = 0;
            }
        }
        System.out.println(maxSum);

    }
}
