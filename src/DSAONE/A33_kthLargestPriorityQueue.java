package DSAONE;

//Using the help of Priority Queue we need to find the kth largest element in an array

import java.util.Collections;
import java.util.PriorityQueue;

public class A33_kthLargestPriorityQueue {
    //Function to return kth largest element in an array
    //Here we will use Priority Queue and make min heap of size k of largest elements
    //Time Complexity - O(nlogn)
    public static int kthLargest(int[] arr , int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0 ; i < k ; i++){
            pq.add(arr[i]);
        }
        for(int i = k ; i < arr.length ; i++){
            if(pq.peek() < arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
    //Function to find kth smallest element in an array
    //Here we will create an max heap of size k using priority queue of all the k smallest element in array;
    //Time Complexity - O(nlogn)
    public static int kthSmallest(int[] arr , int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i < k ; i++){
            pq.add(arr[i]);
        }
        for(int i = k ; i < arr.length ; i++){
            if(pq.peek() > arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] arr = {20 , 10 , 60 , 30 , 50 , 40};
        int k = 3;
        int largest = kthLargest(arr , k);
        System.out.println("Kth Largest: " + largest);

        int smallest = kthSmallest(arr , k);
        System.out.println("Kth Smallest: " + smallest);
    }
}
