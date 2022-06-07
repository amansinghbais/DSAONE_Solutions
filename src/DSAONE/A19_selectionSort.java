package DSAONE;
//Selection Sort
/*
    In this algorithm we perform following operations :---
    -> Iteratively pick smallest element from sorted array
    -> swap smallest element with the first element of the unsorted array
    -> It completes in n - 1 pass
    Time Complexity - O(n^2)   || Best Case - n^2;

* */
public class A19_selectionSort {
    public static void main(String[] args) {
        int[] arr= {4 , 1, 9 , 2 , 3, 6};
        int n = arr.length;

        for(int i = 0 ; i < n-1 ; i++){
            int min = i;
            for(int j = i ; j < n ; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            // if first element is only the smallest element then we don't swap them.
            if(min != i){
                swap(arr , min , i);
            }
        }

//      Printing the array
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void swap(int[] arr , int min , int i){
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }

}
