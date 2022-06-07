package DSAONE;
// Here in this problem we were given height of building in adjacent
// And we have to tell how much water can be filled in between the buildings
// Time Complexity - O(n) || Space Complexity - O(n)

public class A16_rainwaterTrappingProblem {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,0,1,3,2};

        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int maxSoFar = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            maxSoFar = Math.max(arr[i] , maxSoFar);
            left[i] = maxSoFar;
        }
        maxSoFar = Integer.MIN_VALUE;
        for(int i = n-1 ; i >= 0 ; i--){
            maxSoFar = Math.max(arr[i] , maxSoFar);
            right[i] = maxSoFar;
        }

//        Total Water filled
        int total = 0;
        for(int i = 0 ; i < n ;i++){
            total += Math.min(left[i] , right[i]) - arr[i];
        }
        System.out.println("The total water to be filled: " + total);
    }
}
