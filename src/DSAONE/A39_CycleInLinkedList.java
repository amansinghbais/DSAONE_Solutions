package DSAONE;

public class A39_CycleInLinkedList extends LL {
    //Function to detect cycle and the starting point of the cycle in the linked list.
    //Time Complexity - O(n)  &&  Space Complexity - O(1)
    public static int detectCycle(Node head){
        //Detecting whether cycle is present or not.
        Node fast = head , slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) break;
        }
        if(fast == null || fast.next == null) return -1;
        //Finding the point where cycle starts.
        fast = head;
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast.data;
    }

    //Function to remove the cycle from linked list if present.
    //Time - O(n)
    public static void removeCycle(Node head){
        Node fast = head , slow = head;
        while(fast != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) break;
        }
        if(fast == null || fast.next == null) return;

        fast = head;
        Node prev = null;
        while(fast != slow){
            prev = slow;
            fast = fast.next;
            slow = slow.next;
        }
        prev.next = null;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        //Creating cycle----------------------------
        Node temp = list.head;
        while(temp.next != null){temp = temp.next;};
        temp.next = head.next.next.next;
        //------------------------------------------

        int startPoint = detectCycle(head);
        printResult(startPoint);

        removeCycle(head);
        printResult(detectCycle(head));

    }

    //Function to print list whether cycle present or not.
    public static void printResult(int startPoint){
        if(startPoint != -1){
            System.out.println("Yes! The cycle is present in linked list at node " + startPoint);
        }else{
            System.out.println("No! The Cycle is not present in linked list.");
        }
    }

}
