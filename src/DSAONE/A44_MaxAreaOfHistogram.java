package DSAONE;
import java.util.Stack;


//Find the maximum area of rectangle that can be created in histogram.
//By finding the prevSmaller and NextSmaller.
//Time - O(n)
//Time - O(n)
public class A44_MaxAreaOfHistogram {

    //Function to find Previous Smaller Elements.
    public static int[] prevSmaller(int[] arr){
        Stack<Integer> s = new Stack<>();
        int res[] = new int[arr.length];

        for(int i = 0 ; i < arr.length ; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                res[i] = -1;
            }else{
                res[i] = s.peek();
            }
            s.push(i);
        }
        return res;
    }

    //Function to find Next Smaller Elements.
    public static int[] nextSmaller(int[] arr){
        Stack<Integer> s = new Stack<>();
        int res[] = new int[arr.length];

        for(int i = arr.length - 1 ; i >= 0 ; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                res[i] = arr.length;
            }else{
                res[i] = s.peek();
            }
            s.push(i);
        }
        return res;
    }

    //Main Function which find the maximum element
    public static int findMaximum(int[] arr){
        int[] left = prevSmaller(arr);
        int[] right = nextSmaller(arr);

        int maxArea = 0 , area = 0;
        for(int i = 0 ; i < arr.length ; i++){
            area = arr[i] * (right[i] - left[i] - 1);
            maxArea  = Math.max(area , maxArea);
        }
        return maxArea;
    }


    public static void main(String[] args) {
        int[] arr = {4,2,1,5,6,3,2,4,2};

        System.out.print(findMaximum(arr));

    }
}
