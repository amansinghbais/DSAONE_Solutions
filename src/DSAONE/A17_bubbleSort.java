package DSAONE;
//Bubble Sort
// In this algorithm we swap adjacent element until we make sorted array
// We use nested for loop here
// Time Complexity - O(n^2)
// Best case - O(n)
// Space Complexity - O(1)

public class A17_bubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,7,1,5};
        int n = arr.length;
        for(int i = 0 ; i < n-1 ; i++){
            boolean swapped = false;
            for(int j = 0 ; j < n-i-1 ;j++){
                if(arr[j+1] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }

        for(int i = 0 ; i < n; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
