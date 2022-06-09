package DSAONE;
/*
    Binary Search-----
    Searching an element in sorted array
    Recursive Approach;
    Steps:- 1.find mid ind: mid = (low + high)/2
            2.if(a[mid] == key) return mid;
            3.if(key > a[mid]) repeat(low = mid+1)
            4.if(key < a[mid]) repeat(high = mid-1)

    Time complexity - O(logn)

*/
public class A22_binarySearch {

//  Recursive Approach
    public static int binarySearch(int[] arr, int low, int high, int key) {
        if (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            }else if (arr[mid] < key) {
                binarySearch(arr, 0, mid - 1, key);
            }else if(arr[mid] > key) {
                binarySearch(arr, mid + 1, high, key);
            }
        }
        return -1;
    }

//  Iterative Approach
    public static int iterSearch(int[] arr, int key ){
        int l = 0 , r = arr.length -1 ;
        while(l <= r){
            int mid = (l + r)/2;
            if(arr[mid] == key) return mid;

            if(arr[mid] < key){
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-4, -1, 3, 7, 10, 11};
        int key = 7;
//        int ind = binarySearch(arr, 0, arr.length , key);
        int ind = iterSearch(arr, key);
        if (ind == -1) {
            System.out.println(ind);
            System.out.println("The element " + key + " is not present in arr.");
        }else {
            System.out.println("The element " + key + " is present at index " + ind + " in the array.");
        }

    }
}
