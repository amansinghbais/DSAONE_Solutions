package DSAONE;

/*
    In this we find gcd of two number using euclid theorem which says
        gcd(a, b) = gcd(b , a%b);
        until a%b == 0
 */

import java.util.Scanner;

public class A6_findGcd {
    static int gcd(int a,int b){
        if(b == 0) return a;

        return gcd(b , a%b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers to find their GCD: ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        int res = gcd(a , b);
        System.out.println(res);
    }
}
