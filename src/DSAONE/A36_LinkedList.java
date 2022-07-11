package DSAONE;

class LL{
    public static Node head;

    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    //Function to insert a new node at specific position in linked list.
    public void insert(int data , int pos){
        Node newNode = new Node(data);
        if(pos == 0){
            newNode.next = head;
            head = newNode;
            return;
        }

        Node prev = head;
        for(int i = 0 ; i < pos - 1; i++){
            prev = prev.next;
        }
        newNode.next = prev.next;
        prev.next = newNode;
    }

    //Function to add a new node at end of the linked list
    public void add(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }

    //Function to delete a node from the list at specific position
    public void delete(int pos){
        if(pos == 0){
            head = head.next;
            return;
        }

        Node prev = head;
        for(int i = 0 ; i < pos - 1 ; i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }

    //Function to print all the elements of the linked list.
    public void printList(){
        Node curr =  head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    //Function to printList list if head is given.
    public void printList(Node temp){
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}

public class A36_LinkedList {
    public static void main(String[] args) {
        LL list = new LL();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.printList();
        list.insert(8 , 3 );
        list.printList();
        list.insert(0  ,0);
        list.printList();
        list.delete(4);
        list.printList();
        list.delete(0);
        list.printList();
    }
}
