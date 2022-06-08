package DSAONE;
// Merge Sort Algorithm
/*
    - In this we take two pointer i = 0 && j = arr.length and while i < j we perform following task
    - Divide arr in two from its mid and join it

    Time Complexity - O(n*logn)
    Space Complexity - O(n)
*/

public class A21_mergeSort {

    public static void mergeSort(int[] arr , int l  , int h){
        if(l < h){
            int mid = (l+h)/2;
            mergeSort(arr , 0 , mid);
            mergeSort(arr , mid+1 , h);

            merge(arr , 0 , mid , h);
        }
    }

    public static void merge(int[] arr , int l , int mid , int h){
        int i = l;
        int j = mid + 1;
        int k = l;
        int[] b = new int[h-l+1];

//      Adding minimum element from both subarray to new array b
        while(i <= mid && j <= h){
            if(arr[i] < arr[j]){
                b[k] = arr[i];
                i++;
            }else{
                b[k] = arr[j];
                j++;
            }
            k++;
        }
//      Adding remaining element from both subarray to new array b.
        if(i>mid){
            while(j <= h){
                b[k] = arr[j];
                j++;k++;
            }
        }else{
            while (i <= mid){
                b[k] = arr[i];
                i++;k++;
            }
        }
//      Copying whole new sorted array into our original array 'arr'.
        for(k = l ; k <= h ; k++){
            arr[k] = b[k];
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,4,7,6,3,1,5};

        mergeSort(arr , 0 , arr.length-1);

        printArray(arr);
    }

    public static void printArray(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
