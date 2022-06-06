package DSAONE;

// Find the majority element in an array.
// The majority element is an element which occurs more than n/2 times in an array.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class A12_majorityElement {
//---------------------------------------------------------------------------------------------------------
/*  Method-1(Brute force Approach):
    Simply counting freq for each element of array iteratively and take the element with the max frequency
    and comparing it with n/2 if less than it's majority element or not.
    Time Complexity - O(n^2);
    Space Complexity - O(1)

    public static void bruteForceApproach(int[] arr){
        int maxfreq = Integer.MIN_VALUE;
        int maxValue = 0  , n = arr.length , i = 0 , j = 0;
        for(i = 0 ; i < n ; i++){
            int count = 0;
            for(j = i + 1 ; j < n ; j++){
                if(arr[i] == arr[j]) count++;
            }
            if(count > maxfreq){
                maxfreq = count;
                maxValue = arr[i];
            }
        }
        System.out.println("The majority element is " + maxValue + " with the frequency of " + maxfreq);
    }
*/
//-----------------------------------------------------------------------------------------------------------
/*
    Method-2(Using sorting):
        -> In this first we sort the array with time complexity of O(nlogn)
        -> Now for a sorted array we run a loop and find a element with highest frequency.
        Time Complexity - O(nlogn)
        Space Complexity - (1)

    static void method2(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        int count = -1 , val = -1 , maxFreq = 0 , maxVal = 0;
        for(int i = 0 ; i < n ; i++){
            if(count == -1){
                val = arr[i];
                count = 0;
            }
            if(arr[i] != val || i == n - 1) {
                if(i == n-1){
                    count++;
                }
                if(count > maxFreq){
                    maxFreq = count;
                    maxVal = val;
                }
                val = arr[i];
                count = 0;
            }
            count++;
        }
        System.out.println(maxVal + " " + maxFreq);
    }
*/
//-----------------------------------------------------------------------------------------------------------
/* Method-3(Using HashMap):
    Here we use an  extra space
    time comp = O(n)
    space - O(n)

    static void method3UsingHashmap(int[] arr){
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            Integer count = map.containsKey(arr[i])?map.get(arr[i]): 0;
            map.put(arr[i] , count + 1);
        }
        int maxFreq = 0;
        int maxVal = 0;
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            if(entry.getValue() > maxFreq){
                maxFreq = entry.getValue();
                maxVal = entry.getKey();
            }
        }
        if(maxFreq > arr.length/2){
            System.out.println(maxVal + " " + maxFreq);
        }
    }
*/
//-----------------------------------------------------------------------------------------------------------
/*    Method-3(Optimal Solution):-
    In this we run a loop and take each element and its frequency
    -> We update frequency of element until it becomes 0 and if it becomes zero then we take new element with
    frequency 1.
    example-> a = [1,1,2,3,1]
    1 - 1
    1 - 2
    1 - 1
    1 - 0 >>>> 3 - 1
    3 - 0 >>>> 1 - 1
    Answer = 1;

*/
    static void optimalSolution(int[] arr){
        int count =   1;
        int ansInd = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == arr[ansInd]){
                count++;
            }else{
                count--;
            }

            if(count == 0){
                ansInd = i;
                count = 1;
            }
        }
        count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == arr[ansInd]){
                count ++;
            }
        }
        if(count > arr.length/2){
            System.out.println(arr[ansInd]);
        }
    }
//-----------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        int[] arr ={5,1,4,1,1};

//        bruteForceApproach(arr);
//        method2(arr);
//        method3UsingHashmap(arr);
        optimalSolution(arr);
    }
}
