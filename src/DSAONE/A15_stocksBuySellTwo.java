package DSAONE;
// Stock Buy and Sell
// Here you can buy and sell a stock multiple time but at any time you can hold only one stock
// Here we follow simple algorithm which is
// - We iterate over whole array and if curr element is greater than last element we add their difference in total
// - profit

public class A15_stocksBuySellTwo {
    public static void main(String[] args) {
        int[] arr = {5,2,6,1,4,7,3,6};
        int profit = 0;
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > arr[i-1]){
                profit += arr[i] - arr[i-1];
            }
        }
        System.out.println("The max profit will be: " + profit );

    }
}
