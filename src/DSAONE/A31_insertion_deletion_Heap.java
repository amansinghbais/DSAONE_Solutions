package DSAONE;
//Insertion and Deletion in Heap.
public class A31_insertion_deletion_Heap {
    //Function to insert an element in a heap(array)
    //Here we add the element at the end of the array and then compare it with it's parent element till the
    //parent element is smaller then current node and swap them.
    //Time Complexity - O(logn)
    static void insertHeap(int[] arr , int n , int val){
        n = n + 1;
        arr[n] = val;

        int i = n;
        while(i > 1){
            int parent = i / 2;
            if(arr[parent] < arr[i]){
                swap(arr , parent , i);
                i = parent;
            }else{
                return;
            }
        }
    }

    //Function to delete the root node in an heap
    //Here we copy the last element in the first/root element and then
    // Compare it with it's childs and swapping till the current node is less than max of child
    //Time Complexity - O(logn).
    public static void deleteHeap(int[] arr , int n){
        arr[1] = arr[n];
        n = n - 1;
        int i = 1;
        while(i  < n){
            int lChild = arr[2 * i];
            int rChild = arr[2 * i + 1];
            int larger = lChild > rChild ? 2 * i : 2 * i + 1;

            if(arr[larger] > arr[i]){
                swap(arr , larger , i);
                i = larger;
            }else{
                return;
            }
        }
    }


    public static void main(String[] args) {
        int[] array = {0 , 50 , 30 , 40 , 10 , 5 , 20 , 30 , 0};
        int n = 7;
        int val = 60;
        System.out.print("The Heap before insertion: ");
        printArray(array , n);
        System.out.print("The Heap After inserting " + val + " in it: ");
        insertHeap(array , n , val);
        printArray(array , n+1);

        int[] array2 = {0 , 40 , 30 , 10 , 20 , 15};
        int n2 = array2.length - 1;
        System.out.print("The Heap before deletion: ");
        printArray(array2 , n2);
        System.out.print("The Heap after deleting root node: ");
        deleteHeap(array2 , n2);
        printArray(array2 , n2-1);
    }

    //Function to two elements at index i and j in an array.
    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //Function to print all the elements of an array from index 1 to end.
    public static void printArray(int[] arr , int n){
        for(int i = 1; i <= n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
