package DSAONE;

import java.util.Collections;
import java.util.PriorityQueue;

public class A35_medianOfInputStream {
    //Program to find the median of all numbers input so far on every input entered.
    //Time Complexity - O(nlogn)  n for iterating over all number and logn for inserting number in priority queue
    public static class NumberStream{
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        //Function to insert a number in either maxHeap or minHeap based on some conditions
        public void insert(int num){
            if(maxHeap.size() == 0 || maxHeap.peek() >= num){
                maxHeap.add(num);
            }else{
                minHeap.add(num);
            }

            if(maxHeap.size() > minHeap.size() + 1){
                minHeap.add(maxHeap.poll());
            }
            if(minHeap.size() > maxHeap.size()){
                maxHeap.add(minHeap.poll());
            }
        }
        //Function to print the median of all the numbers entered so far.
        public void findMedian(){
            if(maxHeap.size() == minHeap.size()){
                double result = (maxHeap.peek() + minHeap.peek())/2.0;
                System.out.println("Median: " + result);
                return;
            }
            System.out.println("Median: " + maxHeap.peek());
        }
    }

    public static void main(String[] args) {
        NumberStream ns = new NumberStream();

        ns.insert(3);
        ns.findMedian();
        ns.insert(1);
        ns.findMedian();
        ns.insert(4);
        ns.findMedian();
        ns.insert(5);
        ns.findMedian();
        ns.insert(8);
        ns.findMedian();
        ns.insert(6);
        ns.findMedian();
    }
}
