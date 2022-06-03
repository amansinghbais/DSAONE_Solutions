package DSAONE;

/*
    To find the number of zeroes at the end of factorial of a number n.
    ---for a 0 at end we need 2 and a 5 pair
    ---while a 5 occur once in 5 elements
    --- but for some case such as 25 there exist a extra 5 for each 25 element

    General case = n/5 + n/25 + n/125 + ------------------
*/

public class A5_trailingZeroes {
    public static void main(String[] args) {
        int n = 12;
        long fact = 1;
        for(int i = 1 ; i <= n ; i++){
            fact = fact * i;
        }
        long res = 0;
        for(int i = 5 ; i <= fact ; i = i*5){
            res += n/i;
        }

        System.out.println(res);

    }
}
