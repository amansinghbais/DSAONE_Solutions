package DSAONE;

//Find the index of element in an infinite sorted array using binary search
//Time - O(logn)

public class A23_binarySearchInfiniteSortedArray {
    public static int binarySearch(int[] arr, int key , int low , int high){
        if(low <= high){
            int mid = (low + high)/2;

            if(arr[mid] == key) return mid;
            else if(arr[mid] > key){
                return binarySearch(arr , key , low , mid-1);
            }else{
                return binarySearch(arr , key , mid+1 , high);
            }
        }
        return -1;
    }
    public static int searchElement(int arr[] , int key){
        int low = 0;
        int high = 1;
        while(arr[high] < key){
            low = high;
            high = high *  2;
        }
        if(arr[high] == key) return high;

        return binarySearch(arr , key , low , high);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,7,8,12,58,72,96,108,118,267};
        int key = 58;

        int ind = searchElement(arr , key);
        if(ind != -1){
            System.out.println("The element " + key + " is present at " + ind + " index.");
        }else{
            System.out.println("Sorry!"  + key + " is not present in the array");
        }
    }
}
