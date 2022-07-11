package DSAONE;

import java.util.PriorityQueue;

//Here we need to find minimum cost needed to connect n ropes(where cost is sum of length of ropes).

public class A34_nRopeMinimumSum {
    //Here we use priority queue to make a min heap
    //Here we remove two smallest element from min heap find their sum or cost and then add the sum into pq
    //We repeat above step until the priority queue is not empty
    //Time - O(nlogn).

    public static void main(String[] args) {
        int[] arr = {2 , 5 , 4 , 8 , 6, 9};

        PriorityQueue<Integer> pq = new PriorityQueue<>(); //Min-Heap
        for(int i = 0 ; i < arr.length ; i++){  //
            pq.add(arr[i]);                     //  Time - O(nlogn)
        }                                       //

        int ans = 0;
        while(pq.size() > 1){
            int first = pq.poll();
            int second = pq.poll();

            int sum = first + second;
            ans += sum;
            pq.add(sum);
        }
        System.out.println("Total Cost: " + ans);
    }
}
