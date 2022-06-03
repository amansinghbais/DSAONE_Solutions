package DSAONE;
//In this we will create two basic recursion function
public class A8_recursionBasic {
    //1. sum of n natural numbers
    static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }

//    2. Value of a power b:
    static int power(int a , int b){
        if(b == 0) return 1;

        return a * power(a , b - 1);
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.print("The sum of first " + n + " natural numbers is: ");
        System.out.println(sum(n));

        int a = 2;
        int b = 11;
        System.out.print("The value of " + a + " power " + b + " is equal to: ");
        System.out.println(power(a, b));

    }
}
