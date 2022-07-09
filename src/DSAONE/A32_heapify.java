package DSAONE;

public class A32_heapify {
    //Algorithm to build a heap
    //Time Complexity - O(n)
    //Here we start from back in array and for every node we heapify the tree taking that note as root node
    //Time Complexity - O(n)


    //Main build heap function to iterate over array to perform heapify
    public static void buildHeap(int[] arr , int n){
        for(int i = n / 2 ; i > 0 ; i--){
            heapify(arr , n  , i);
        }
    }
    //Heapify function to make tree below the given node a max-heap
    public static void heapify(int[] arr , int n , int i){
        int largest = i;
        int left = 2 * i;
        int right = 2 * i + 1;
        if(right <= n && arr[right] > arr[largest]){
            largest = right;
        }
        if(left <= n && arr[left] > arr[largest]){
            largest = left;
        }

        if(largest != i){
            swap(arr , largest , i);
            heapify(arr , n , largest);
        }

    }

    //Function to sort an array using heapSort.
    //For heapSort we must make a heap of an binary tree and then perform operations.
    //Time Complexity - O(nlogn)
    public static void heapSort(int[] arr , int n){
        for(int i = n ; i > 1 ; i--){      // ---- O(n)
            swap(arr , 1 , i);
            heapify(arr , i - 1 , 1); // ---- O(logn)
        }
    }

    public static void main(String[] args) {
        int[] arr = {0 , 20 , 10 , 30 , 5 , 50 , 40};

        System.out.print("The tree before building heap: ");
        printArray(arr);
        buildHeap(arr , arr.length - 1);
        System.out.print("The tree after building heap: ");
        printArray(arr);
        System.out.print("The sorted array: ");
        heapSort(arr , arr.length - 1);
        printArray(arr);
    }

    //Function to print the array
    public static void printArray(int[] arr){
        for(int i = 1 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Function to swap elements in an array
    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
