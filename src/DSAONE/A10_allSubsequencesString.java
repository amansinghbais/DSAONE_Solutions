package DSAONE;
//Here we will print all the possible subsequences(Superset) of string using recursion
//Time complexity of this algo is O(2^n) // Since there are two possibilities for each character that either
//we include that or not.

public class A10_allSubsequencesString {

    static void superSet(String str , int i , String curr){
        if(i == str.length()){
            System.out.print(curr + " ");
            return;
        }

        superSet(str , i+1 , curr+str.charAt(i));
        superSet(str , i+1 , curr);
    }

    public static void main(String[] args) {
        String str = "abcde";

        superSet(str , 0 , "");

    }
}
