package DSAONE;
// Allocate minumum Pages(Book Allocation)
// Minimize the maximum no. of pages read by a student.
// Time Complexity - O(nlogn)
public class A25_bookAllocation {
    public static int minPages(int[] a , int k){
        int min = maxOf(a);
        int max = sumOf(a);
        int res = 0;

        while(min <= max){
            int mid = (min + max)/2;
            if(isFeasible(a , k , mid)){
                res = mid;
                max = mid -1;
            }else{
                min = mid + 1;
            }
        }
        return res;
    }

//    Check if we can distribute books in students equal or less than k such that maximum of book read by a
//    student will be less than res.
    public static boolean isFeasible(int[] a , int k , int res){
        int sum = 0 , student = 1;
        for(int i = 0 ; i < a.length ; i++){
            if(sum+a[i] > res){
                student++;
                sum = a[i];
            }else{
                sum += a[i];
            }
        }
        return student <= k;
    }

    public static void main(String[] args) {
        int[] arr = {10 , 20 , 5, 15, 5};
        int k = 2;

        int res = minPages(arr , k);
        System.out.print("The minimum of maximum pages read by a student are: " + res);
    }

    public static int sumOf(int[] arr){
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static int maxOf(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ;i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

}
