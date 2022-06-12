package DSAONE;

import java.util.HashMap;
import java.util.Set;

//Find the subarray whose sum is given is given.
//Using HashMap
//Time complexity - O(n)
//Space - O(n)

public class A28_subarraySumHashMap {
    public static void main(String[] args) {
        int[] a = {10 , 15 , -5 , 15 , -10 , 5};
        int sum = 5;

        HashMap<Integer , Integer> map = new HashMap<>();
        int currSum = 0;
        int start = 0;
        int end = -1;
        for(int i = 0 ; i < a.length ; i++){
            currSum += a[i];
            if(currSum - sum == 0){
                start = 0;
                end = i;
                break;
            }
            if(map.containsKey(currSum - sum)){
                start = map.get(currSum - sum) + 1;
                end = i;
                break;
            }
            map.put(currSum , i);
        }

        if(end == -1){
            System.out.println("The subArray not found.");
        }else{
            System.out.println(start + " to " + end);
        }
    }
}
