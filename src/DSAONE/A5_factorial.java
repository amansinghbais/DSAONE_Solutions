package DSAONE;

public class A5_factorial {
    /*
        Iterative Approach---
        Time complexity = O(n)
        Space Complexity = O(1)
    */
    public static long factIter(int n){
        long result = 1;
        for(int i = 1 ; i <= n ; i++){
            result *= i;
        }
        return result;
    }

    /*
        Recursive Approach---
        Time Complexity = O(n)
        Space Complexity = O(1)
    */
    public static long factRecurs(int n){
        if(n <= 0) return 1;

        return n * factRecurs(n-1);
    }


    public static void main(String[] args) {
        int n = 8;

//        long res = factIter(n);
        long res = factRecurs(n);

        System.out.println("The factorial of " + n + " is : " + res );
    }
}
