package DSAONE;

//Implement Stack using Two Queues

import java.util.ArrayDeque;
import java.util.Queue;

class StackUsingQueue{
    Queue<Integer> q1 = new ArrayDeque<>();
    Queue<Integer> q2 = new ArrayDeque<>();

    public void push(int data){
        while(!q1.isEmpty()){
            q2.add(q1.poll());
        }
        q1.add(data);
        while(!q2.isEmpty()){
            q1.add(q2.poll());
        }
    }

    public int pop(){
        return q1.poll();
    }

    public int peek(){
        return q1.peek();
    }
}

public class A51_StackUsingQueue {
    public static void main(String[] args) {
        StackUsingQueue s = new StackUsingQueue();

        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());

    }
}
