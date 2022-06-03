package DSAONE;
//here we check whether a string is a palindrome or not using recursion.
//Time complexity = O(n)
public class A10_palindromeStringRecursion {

    static boolean isPalindrome(String s , int l , int r){
        if(l >= r) return true;

        if(s.charAt(l) != s.charAt(r)) return false;

        return isPalindrome(s , l+1 , r-1);
    }

    public static void main(String[] args) {
        String str = "racecar";
        int l = 0, r = str.length() -1;
        if(isPalindrome(str , l , r)){
            System.out.println("Yes! " + str + " is a palindrome string.");
        }else{
            System.out.println("No! " + str + " is not a palindrome string.");
        }
    }
}
