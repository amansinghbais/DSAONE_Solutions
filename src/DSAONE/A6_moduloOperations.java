package DSAONE;

import java.util.Scanner;

public class A6_moduloOperations {

    // Here we calculate x power p optimally with log(n) time complexity;
    // Here we try to divide whole problem into small problem by increasing the value and decreasing the power.
    static int calcPower(int x , int p){
        int res = 1;

        while(p > 0){
            if((p&1) != 0){
                res = res * x;
            }
            x = x * x;
            p = p >> 1;
        }
        return res;
    }

//    If we want to find a power b modulo n for large value of a &b
//    we perform it using some rules
//    (a+b)%n = (a%n + b%n)%n;
//    (a*b)%n = (a%n * b%n)%n;
    static long largePower(long a , long b , int n){
        long res = 1;
        while(b > 0){
            if((b & 1) != 0){
                res = (res * a % n) %n;
            }
            a = (a%n * a %n)%n;
            b = b >> 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter value and its power respectively: ");
//        int x = scan.nextInt();
//        int p = scan.nextInt();
//
//        System.out.println(calcPower(x , p));

        System.out.println("Enter value a , b  , n for a power b % n: ");
        long a = scan.nextLong();
        long b = scan.nextLong();
        int n = scan.nextInt();

        System.out.println(largePower(a , b , n));

    }
}
