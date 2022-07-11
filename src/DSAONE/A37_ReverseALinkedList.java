package DSAONE;

public class A37_ReverseALinkedList extends LL{

    //Iterative approach to revere a linked list
    //Here we use three pointer approach curr , prev and next and we iterate over list using curr node and reverse
    //all node
    //Time - O(n)
    public static void reverseListIterative(){
        Node curr = head , prev = null , next = null;

        while(curr != null){
            next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //Function to reverse a linked list using recursion
    public static Node reverseListRecursive(Node head){
        //Base condition
        if(head == null || head.next == null){
            return head;
        }

        Node newHead = reverseListRecursive(head.next);
        Node headNext = head.next;
        headNext.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.printList();

//        reverseListIterative();
//        list.printList();
        Node newHead = reverseListRecursive(head);
        list.printList(newHead);

    }
}
