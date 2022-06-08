package DSAONE;

// Quick Sort Algorithm
/*
    - Here we pick an pivot element and divide the array into two subarray around pivot element where left
    - subarray will contains all elements less than or equal to pivot while right subarray contains all the
    - elements greater than pivot element.

    Time Complexity - O(n^2) Worst Case  / Average Case
                    - O(nlogn) Best Case
    Space Complexity - O(n) //Because of recursion it have a recursion stack which holds n items at each level.
*/

public class A20_quickSort {

    public static  void quickSort(int[] arr , int l , int h){
        if(l < h){
            int p = partition(arr,l , h);
            quickSort(arr ,0 ,p - 1);
            quickSort(arr ,p+1 , h);
        }
    }

    public static int partition(int[] arr , int l , int h){
        int i = l , j = h;
        int pivot = arr[l];

        while(i < j){
            while(arr[i] <= pivot) i++;
            while(arr[j] > pivot) j--;

            if(i < j){
                swap(arr , i , j);
            }
        }

        swap(arr , l , j);
        return j;
    }

    public static void main(String[] args) {
         int[] arr = {4,6,2,5,7,9,1,3};

         quickSort(arr , 0 , arr.length -1);

         print(arr);
    }

    static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    static void print(int[] arr){
        System.out.print("The sorted array is follows: ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
