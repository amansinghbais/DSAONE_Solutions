package DSAONE;

//Find two non-repeating elements in an array where each element occurs twice.

public class A2_xor_two_nonrepeating {
    public static void main(String[] args) {
        /*
            Using XOR:----
            1- Find the xor of all the element of the array
            2- Calculate sum = sum & (-sum).
            3- for each element of array--
                if((arr[i] & sum) > 0)
                    sum1 = sum1 ^ arr[i]
                else
                    sum2 = sum2 ^ arr[i]

            Time Complexity - O(n)
            Space Complexity - O(1)
        */

        int[] arr = {5, 4, 1, 4, 3, 5, 1, 2};
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum = sum ^ arr[i];
        }
        sum = sum & (-sum);

        int sum1 = 0 , sum2 = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if((arr[i] & sum) > 0){
                sum1 = sum1 ^ arr[i];
            }else{
                sum2 = sum2 ^ arr[i];
            }
        }

        System.out.println("The two non-repeating elements are: " + sum1 + " " + sum2);

    }
}
