package DSAONE;

//Queue Implementation using Array.
class QueueUsingArray{
    int rear , capacity;
    int[] arr;

    QueueUsingArray(int size){
        arr = new int[size];
        capacity = size;
        rear = -1;
    }

    public void enqueue(int data){
        if(rear == capacity - 1){
            throw new RuntimeException("The Queue is full!!!");
        }
        rear++;
        arr[rear] = data;
    }

    public int dequeue(){
        if(rear == -1){
            throw new RuntimeException("The Queue is Empty!!!");
        }
        int result = arr[0];
        for(int i = 0 ; i  < rear ; i++){
            arr[i] = arr[i+1];
        }
        rear--;
        return result;
    }

    public int getfront(){
        if(rear == -1){
            throw new RuntimeException("The Queue is empty!");
        }
        return arr[0];
    }

    public void printQueue(){
        for(int i = 0 ; i <= rear ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

public class A49_QueueUsingArray {
    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray(10);
//        q.getfront();
        q.enqueue(1);
        q.enqueue(2);
        System.out.println(q.getfront());
        q.enqueue(3);
        q.printQueue();
        q.dequeue();
        q.enqueue(4);
        System.out.println(q.dequeue());
        q.printQueue();
    }
}
