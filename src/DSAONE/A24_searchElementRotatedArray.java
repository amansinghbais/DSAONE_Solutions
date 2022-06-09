package DSAONE;
// Search an element in a sorted and rotated array using binary search
// Time Complexity - O(logn).
public class A24_searchElementRotatedArray {

    public static int binarySearch(int[] arr, int key){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == key){
                return mid;
            }else if(arr[low] < arr[mid]){
                if(key >= arr[low] && key <= arr[high]){
                    high = mid;
                }else{
                    low = mid + 1;
                }
            }else{
                if(key > arr[mid] && key <= arr[high]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {20,30,40,50,60,5,10};
        int key = 10;

        int res = binarySearch(arr , key);
        if(res == -1){
            System.out.println("The element " + key + " is not present in the array.");
        }else{
            System.out.println("The element " + key + " is present at index " + res + " in the array.");
        }
    }
}
