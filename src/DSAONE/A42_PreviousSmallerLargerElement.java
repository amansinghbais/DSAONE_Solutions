package DSAONE;
import java.util.Stack;

//Problem Statement
//Print Previous smaller element and Previous Greater Element of whole array elements.

public class A42_PreviousSmallerLargerElement {

    //Previous Smaller Element
    public static void prevSmallerElement(int arr[]){
        Stack<Integer> s = new Stack<>();

        for(int i = 0 ; i < arr.length ; i++){
            while(!s.isEmpty() && s.peek() >= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                System.out.print(-1 + " ");
            }else{
                System.out.print(s.peek() + " ");
            }
            s.push(arr[i]);
        }
        System.out.println();
    }

    //Previous Greater Element
    public static void prevGreaterElement(int[] arr){
        Stack<Integer> s = new Stack<>();
        for(int i = 0 ; i < arr.length ; i++){
            while(!s.isEmpty() && s.peek() <= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                System.out.print(-1 + " ");
            }else{
                System.out.print(s.peek() + " ");
            }
            s.push(arr[i]);
        }
        System.out.println();
    }

    //Next Smaller Element
    public static void nextSmallerElement(int[] arr){
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length - 1 ; i >= 0 ; i--){
            while(!s.isEmpty() && s.peek() >= arr[i]){
                s.pop();
            }
            int val = 0;
            if(s.isEmpty()){
                val = -1;
            }else{
                val = s.peek();
            }
            s.push(arr[i]);
            arr[i] = val;

        }
        printArray(arr);
    }

    //Next Greater Element
    public static void nextGreaterElement(int[] arr){
        Stack<Integer> s = new Stack<>();
        int val = 0;
        for(int i = arr.length - 1 ; i >= 0 ; i--){
            while(!s.isEmpty() && s.peek() <= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                val = -1;
            }else{
                val = s.peek();
            }
            s.push(arr[i]);
            arr[i] = val;
        }
        printArray(arr);
    }


    public static void main(String[] args) {
        int arr[] = {4 , 10 , 5 , 8 , 20 , 15 , 3 , 12};
        printArray(arr);
        prevSmallerElement(arr);
        prevGreaterElement(arr);
        System.out.println();
        int arr2[] = {3 , 10 , 5 , 1 , 15 , 10 , 7 , 6};
        printArray(arr2);
        nextSmallerElement(arr2);
        nextGreaterElement(arr2);

    }

    //Function to print Array
    public static void printArray(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
