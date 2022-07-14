package DSAONE;

import java.util.Scanner;
import java.util.Stack;

public class A43_ParenthesisBalancer {

    public static boolean isOpening(char ch){
        return ch == '(' || ch == '{' || ch == '[';
    }

    public static boolean check(char a , char b){
        if((a == '}' && b == '{') || (a == ')' && b == '(') || (a == ']' && b == '[')){
            return true;
        }else{
            return false;
        }
    }

    public static boolean checkBrackets(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i <s.length() ; i++){
            char ch = s.charAt(i);

            if(isOpening(ch)){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else if(!check(ch , stack.peek())){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "({[]})";

        if(checkBrackets(str)){
            System.out.println("YES! The string is balanced.");
        }else{
            System.out.println("NO! The string is not balanced.");
        }

    }
}
