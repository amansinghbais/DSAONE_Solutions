package DSAONE;

//SLIDING WINDOW MAXIMUM
//Print all the maximum of each window of size k in the array.

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.PriorityQueue;

public class A54_SlidingWindowMaximum {

    //Approach - 1 : Brute Force
    //Using two for loop for finding max of every subarray of size k
    //Time complexity - O(n * k)   &&    Space - O(1)
    public static void approach1(int[] a , int k){
        for(int i = 0 ; i < a.length - k + 1 ; i++){
            int maxVal = 0;
            for(int j = i ; j < i + k ; j++){
                maxVal = Math.max(maxVal , a[j]);
            }
            System.out.print(maxVal + " ");
        }
        System.out.println();
    }

    //Approach - 2 : Using Max - Priority Queue
    //Here we iterate over array and for every k size window we make a priority queue and return its max element
    //Time Complexity - O(nlogk)   &&   space - O(k)
    public static void approach2(int[] a ,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i  < k ; i++){
            pq.add(a[i]);   // logk time
        }
        System.out.print(pq.peek() + " ");
        for(int i = k ; i < a.length ; i++){   //n time
            pq.remove(a[i - k]);
            pq.add(a[i]);  //logk time
            System.out.print(pq.peek() + " ");
        }
        System.out.println();
    }

    //Approach - 3 : Using Double Ended Queue(Deque)
    //Time - o(n)   &&  Space - O(k)
    public static void approach3(int[] a , int k){
        Deque<Integer> dq = new ArrayDeque<>();
        int i = 0;
        for(i = 0 ; i < k ; i++){
            while(!dq.isEmpty() && a[i] >= a[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }

        for(; i < a.length ; i++){
            System.out.println(a[dq.peek()] + " ");

            while(!dq.isEmpty() && dq.peek() <= i - k){
                dq.removeFirst();
            }

            while(!dq.isEmpty() && a[i] >= a[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        System.out.println(a[dq.peek()]);
    }


    public static void main(String[] args) {
        int a[] = {4,1,3,5,1,2,3,2,1,1,5};
        int k = 3;

//        approach1(a , k);
//        approach2(a , k);
        approach3(a , k);
    }
}
