package DSAONE;

import java.util.HashMap;
import java.util.HashSet;

// Given an array and you have to find no. of distinct element in every k group
// Sliding Window
// Time Complexity - O(k)

public class A29_distinctElementInWindowK {
    public static void main(String[] args) {
        int a[] = {1 , 2, 2, 1, 3, 1, 1, 3};
        int k = 4;
        HashMap<Integer , Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0 ; i < k ; i++){
             map.put(a[i] , map.getOrDefault(a[i] , 0) + 1);
        }
        System.out.print(map.size() + " ");

        for(int i = k ; i < a.length ; i++){
            if(map.get(a[i-k]) == 1){
                map.remove(a[i-k]);
            }else{
                map.put(a[i-k] , map.get(a[i-k]) - 1);
            }

            map.put(a[i] , map.getOrDefault(a[i] , 0) + 1);
            System.out.print(map.size() + " ");

        }


    }
}
