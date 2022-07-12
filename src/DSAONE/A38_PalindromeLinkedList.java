package DSAONE;

//In linked list we have to check whether the list is palindrome or not.

public class A38_PalindromeLinkedList extends LL{

    //Optimal solution to check whether a list is palindrome or not
    //Here we find the middle node in the linked list
    //Then we reverse the list after middle node
    //Then we check both half of the linked whether they are same or not
    //Time Complexity - O(n)   &&  Space Complexity - O(1).
    public static boolean checkPalindrome(Node head){
        if(head == null) return true;
        Node mid = findMiddle(head);

        Node last = reverse(mid.next);
        Node curr = head;

        while(last != null){
            if(last.data != curr.data){
                return false;
            }
            last = last.next;
            curr = curr.next;
        }
        return true;
    }

    //Function to reverse the linked list and return the new Head of the reversed linked list.
    public static Node reverse(Node head){
        Node curr = head , prev = null , nex = null;
        while(curr != null){
            nex = curr.next;

            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        return prev;
    }

    //Function to find the middle node in a linked list using two pointer approach in O(n) time.
    public static Node findMiddle(Node head){
        Node fast = head;
        Node slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        LL list = new LL();

        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        boolean result = checkPalindrome(list.head);


        //Printing the result..........
        if(result){
            System.out.println("Yes! The list is palindrome.");
        }else{
            System.out.println("No! The list is not palindrome.");
        }
    }
}
