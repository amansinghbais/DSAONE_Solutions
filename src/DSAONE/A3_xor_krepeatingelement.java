package DSAONE;

//Find the only non-repeating element in an array where each element repeats k times where k = 3.

public class A3_xor_krepeatingelement {
    public static void main(String[] args) {
        int k = 3;
        int[] a = {2, 2, 1, 5, 1, 2, 1};
        int[] count = new int[32];
        for(int i = 0 ; i < 32 ; i++){
            for(int j = 0 ; j < a.length ; j++){
                if((a[j] & (1<<i)) != 0){
                     count[i] += 1;
                }
            }
        }
        int res = 0;
        for(int i = 0; i < 32 ; i++){
            res += (count[i]%k) * (1<<i);
        }
        System.out.println("The element is : " + res);

//        Time complexity - O(n)
//        Space Complexity - O(1)


    }
}
