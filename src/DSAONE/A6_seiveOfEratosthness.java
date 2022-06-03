package DSAONE;

import java.util.Arrays;
import java.util.Scanner;

/*
    Here in this question we will find all the prime numbers form 2 to n.
    Here we use an extra array for storing boolean value
    we iterate from i = 2 to i < sqrt(n)
        we make boolean value of all multiple of i to false

    return the boolean array
*/

public class A6_seiveOfEratosthness {
    static boolean[] findPrime(int n){
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime , true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i = 2 ; i* i <= n ; i++){
            for(int j = 2*i ; j <= n ; j += i){
                isPrime[j] = false;
            }
        }

        return isPrime;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to find all prime numbers upto that number: ");
        int n = scan.nextInt();

        boolean isPrime[] = findPrime(n);

        for(int i = 1 ; i <= n ; i++){
            if(isPrime[i] == true){
                System.out.print(i + " ");
            }
        }

    }
}
