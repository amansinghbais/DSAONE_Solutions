package DSAONE;
//Here we print all the possible permutations of a string

public class A10_permutationOfString {

    static void permute(String s , int l , int r){
        if(l == r){
            System.out.print(s+" ");
            return;
        }

        for(int i = l ; i <= r ; i++){
            s = swap(s , l , i);
            permute(s , l+1 , r);
            s = swap(s , l , i);
        }

    }

    static String swap(String str , int i , int j){
        char[] arr = str.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "abcd";

        permute(str , 0 , str.length()-1);

    }
}
