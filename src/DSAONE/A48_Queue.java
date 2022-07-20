package DSAONE;

//Queue Implementation using Linked List.

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

class Queue{
    Node front , rear;

    //Enqueue Function to insert a new element in the queue at the end.
    public void enqueue(int data){
        Node temp = new Node(data);
        if(front == null){
            front = rear = temp;
            return;
        }
        rear.next = temp;
        rear = temp;
    }

    //Dequeue Function to remove a element from the front of the queue.
    public int dequeue(){
        if(front == null){
            throw new RuntimeException("Queue is Empty!!!!");
        }
        int res = front.data;
        front = front.next;
        return res;
    }

    //Function to print the whole list.
    public void printList(){
        if(front == null){
            System.out.println("Empty List");
        }
        Node curr = front;
        while(curr != null){
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

}

public class A48_Queue {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.printList();
        q.dequeue();
        q.enqueue(4);
        q.dequeue();
        q.printList();
    }
}
