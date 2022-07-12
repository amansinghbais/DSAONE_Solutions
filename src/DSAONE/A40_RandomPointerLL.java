package DSAONE;

public class A40_RandomPointerLL {

    //Problem is to create a duplicate Linked List with every node having random pointer pointing to some random node

    public static Node duplicateList(Node head){
        Node curr = head;
        //First while loop to add a duplicate node after every node in linked list.
        while(curr != null){
            Node temp = curr.next;
            curr.next = new Node(curr.data);
            curr.next.next = temp;
            curr = temp;
        }
        curr = head;
        //Second while loop to copy the rand pointer reference of each original node to the next duplicate node.
        while(curr != null){
            if(curr.next != null){
                curr.next.rand = (curr.rand != null) ? curr.rand.next : null;
            }
            curr = curr.next.next;
        }
        curr = head;
        Node copy = head.next;
        Node copyHead = copy;
        //Third Node to seperate both original and duplicate node.
        while(curr != null && copy.next != null){

            curr.next = curr.next.next;
            copy.next = copy.next.next;
            curr = curr.next;
            copy = copy.next;
        }
        curr.next = null;
        return copyHead;
    }

    public static void main(String[] args) {
        Node head = createList();

        Node copy = duplicateList(head);

        printList(head);
    }
    //--------------------------------------------------------
    public static class Node{
        int data;
        Node next;
        Node rand;
        Node(int data){
            this.data = data;
        }

    }

    public static void printList(Node head){
        while(head != null){
            System.out.println(head.data +  " -> " + head.rand.data);
            head = head.next;
        }
    }

    public static Node createList(){
        Node head = new Node(1);
        Node temp = head;
        temp.next = new Node(2);
        temp = temp.next;
        temp.next = new Node(3);
        temp = temp.next;
        temp.next = new Node(4);

        temp = head;

        temp.rand = temp.next.next;
        temp = temp.next;
        temp.rand = head;
        temp = temp.next;
        temp.rand = head.next;
        temp = temp.next;
        temp.rand = head.next.next;

        return head;
    }
}
