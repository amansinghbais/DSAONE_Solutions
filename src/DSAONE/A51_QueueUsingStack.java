package DSAONE;

//Implementation of Queue using two stack.

import java.util.Stack;

class QueueUsingStack{
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void push(int data){
        s1.push(data);
    }

    public int pop(){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int ans = s2.pop();
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return ans;
    }

    public int peek(){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int ans = s2.peek();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return ans;
    }

}

public class A51_QueueUsingStack {
    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();
        q.push(10);
        q.push(20);
        q.push(30);
        System.out.print(q.peek() + " ");
        q.pop();
        System.out.println(q.peek() + " ");
    }
}
