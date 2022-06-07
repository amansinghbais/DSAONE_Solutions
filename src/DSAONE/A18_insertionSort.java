package DSAONE;
// Insertion Sort
// In this think of array in two part one sorted array and one unsorted
// We one by one pick element from unsorted array and place it at it's correct position in sorted array.
// Time Complexity - O(n^2)
// Best case - o(n)

public class A18_insertionSort {
    public static void main(String[] args) {
        int[] a = {8 , 4 , 1, 5 , 9 , 2};
        int n = a.length;
        for(int i = 1; i < n; i++){
            int temp = a[i];
            int j = i -1;
            while(j >= 0 && a[j] > temp){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }

        for(int i = 0 ; i < n ; i++){
            System.out.print(a[i] + " ");
        }

    }
}
