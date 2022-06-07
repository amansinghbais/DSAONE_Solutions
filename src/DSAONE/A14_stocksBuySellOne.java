package DSAONE;

//In this Question we buy a stock and sell it off so as to make best profit.
//In this you can only buy or sell once

public class A14_stocksBuySellOne  {

//    BruteForce Approach
//    Using nested for loop
//    Time Comp - O(n^2) || Space Comp - O(1)
    static void bruteApproach(int[] arr){
        int n = arr.length;
        int max = 0;
        int curr = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1 ; j < n ; j++){
                curr = arr[j] - arr[i];
                if(curr > max) max = curr;
            }
        }
        System.out.println(max);
    }

//    Method-2(Using Space)
//    Using an auxiliary space(i.e., an extra array)
//    Time Comp - O(n) || Space Comp - O(n)
    static  void usingSpace(int[] arr){
        int n = arr.length;
        int[] aux = new int[n];
        int maxSoFar = Integer.MIN_VALUE;
        for(int i = n - 1; i >= 0 ; i--){
            if(arr[i] > maxSoFar){
                maxSoFar = arr[i];
            }
            aux[i] = maxSoFar;
        }
        maxSoFar = Integer.MIN_VALUE;
        for(int i  = 0;i < n ; i++){
            if(aux[i] - arr[i] > maxSoFar){
                maxSoFar = aux[i] - arr[i];
            }
        }
        System.out.println(maxSoFar);
    }

//    Optimal Solution -
//    for each element in array we will store minSoFar in an variable and calculate maxProfit so far
//    Time Comp - O(n) || Space Comp - O(1)
    static void optimalSol(int[] arr){
        int n = arr.length;
        int minSoFar = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] < minSoFar){
                minSoFar = arr[i];
            }
            if(arr[i] - minSoFar > maxProfit){
                maxProfit = arr[i] - minSoFar;
            }
        }
        System.out.println(maxProfit);
    }


    public static void main(String[] args) {
        int[] a = {3,1,4,8,9,2,5};

//        bruteApproach(a);
//        usingSpace(a);
        optimalSol(a);

    }
}
