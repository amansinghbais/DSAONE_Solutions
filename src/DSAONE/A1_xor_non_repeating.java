package DSAONE;
/*
    Find the only non-repeating element in an array where each element repeats twice.
    example:   a = [5,4,1,4,3,5,1]
    Here 4 is the only number which don't occurs twice.
*/

public class A1_xor_non_repeating {
    public static void main(String[] args) {
        int[] arr = {5,4,1,4,3,5,1};

        /* Method1(Naive Approach) - Using nested for loop
               time complexity: O(n^2)
               Space Complexity: O(1)

           Method2(Using hashSet) - Adding element in set if not present and remove it if found twice.
                time complexity: O(n)
                space complexity: O(n)

           Method3(Using XOR) - Find xor of all the element of array which at last gives the desired element
                time complexity: O(n)
                space complexity: O(1)
                {Optimal Solution 3}
        */

        int res = 0;
        for(int i = 0 ; i < arr.length ; i++){
            res = res ^ arr[i];
        }

        System.out.println(res);
    }
}
