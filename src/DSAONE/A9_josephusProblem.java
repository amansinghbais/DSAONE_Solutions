package DSAONE;
// In this we have n friends standing in a circle with person at 0th position has a gun and we are given k . So the
// person having gun kill the person at k-1th position from him and pass the gun to kth position person
// This will continue untill a single person remains and we have to tell which person will be alive
public class A9_josephusProblem {

    static int jos(int n , int k){
        //Base case here will be a single person remains
        if(n == 1) return 0;

        return (jos(n-1 , k) + k) % n;
    }

    public static void main(String[] args) {
        System.out.println(jos(5 , 3));
    }
}
