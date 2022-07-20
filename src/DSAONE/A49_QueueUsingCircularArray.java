package DSAONE;

class QueueUsingCircularArray{
    int n;
    int a[];
    int front = -1 , rear = -1;

    public QueueUsingCircularArray(int n){
        this.n = n;
        a = new int[n];
    }

    public void enqueue(int data){
        if((rear+1)%n == front){
            return;
        }
        if(front == -1) front = 0;

        rear = (rear + 1) % n;
        a[rear] = data;
    }

    public int dequeue(){
        if(front == -1){
            throw new RuntimeException("Queue is Empty");
        }
        int result = a[front];
        if(front == rear){
            front = rear = -1;
        }else{
            front = (front + 1) % n;
        }
        return result;
    }

    public void printQueue(){
        for(int i = front ; i <= rear ; i = (i + 1) % n){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

}

public class A49_QueueUsingCircularArray {
    public static void main(String[] args) {
        QueueUsingCircularArray q = new QueueUsingCircularArray(10);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.printQueue();
        q.dequeue();
        q.enqueue(4);
        System.out.println(q.dequeue());
        q.printQueue();
    }
}
