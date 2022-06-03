package DSAONE;
/*
    The objective is to check whether a number is palindrome or not
    -We first reverse the number and check it with the original number
    Time Complexity = O(n)
    Space Complexity = O(1)
*/

import java.util.Scanner;

public class A5_PalindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check whether palindrome or not--");
        int n = scan.nextInt();
        int rev = 0;
        int out = n;
        while(n > 0){
            rev = (rev * 10) + (n%10);

            n = n/10;
        }
        if(rev == out){
            System.out.println("Yes! " + out + " is a palindrome number.");
        }else{
            System.out.println("No! " + out + " is not a palindrome number.");
        }
    }
}
