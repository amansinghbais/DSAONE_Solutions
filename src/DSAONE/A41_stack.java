package DSAONE;

class MyStack{
    int[] arr;
    int top;
    int capacity;

    //Constructor to initialize array and top and declare capacity.
    MyStack(int capacity){
        this.capacity = capacity;
        top = -1;
        arr = new int[capacity];
    }
    //Function push to add a new data into the stack
    public void push(int data){
        if(top == capacity - 1){
            throw new RuntimeException("Stack Overflow!");
        }
        top++;
        arr[top] = data;
    }
    //Function to remove and return the top element of the stack.
    public int pop(){
        if(top == -1){
            throw new RuntimeException("Stack Empty!");
        }
        int res = arr[top];
        top--;
        return res;
    }
    //Function to return the top element in the stack.
    public int peek(){
        if(top == -1){
            throw new RuntimeException("Stack Empty!");
        }
        return arr[top];
    }
    //This function returns whether the stack is empty or not.
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }
    //Function that returns whether the stack is full or not.
    public boolean isFull(){
        if(top == capacity - 1){
            return true;
        }
        return false;
    }

}

class MyStackUsingLL extends LL{
    Node head;
    int size;
    //Constructor to initialize head and size of stack.
    public MyStackUsingLL(){
        head = null;
        size = 0;
    }

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        size++;
        head = newNode;
    }

    public int pop(){
        if(head == null){
            throw new RuntimeException("Stack Empty!");
        }
        int temp = head.data;
        head = head.next;
        size--;
        return temp;
    }

    public int peek(){
        if(head == null){
            throw new RuntimeException("Stack Empty!");
        }
        return head.data;
    }

    public boolean isEmpty(){
        if(head == null) return true;

        return false;
    }

    public int size(){
        return size;
    }

}

public class A41_stack {
    public static void main(String[] args) {
//        MyStack stack = new MyStack(10);
        MyStackUsingLL stack = new MyStackUsingLL();
        System.out.println(stack.isEmpty());
//        stack.pop();
        stack.push(5);
        stack.push(4);
        stack.push(1);
        System.out.println(stack.pop());
        stack.push(8);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        stack.push(10);
        stack.push(10);
        stack.push(10);
        stack.push(10);
        stack.push(10);
        stack.push(10);
        stack.push(10);
        stack.push(10);
        stack.push(10);
        stack.push(10);
        System.out.println(stack.size());

    }
}
