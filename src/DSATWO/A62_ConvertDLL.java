package DSATWO;

//Convert a Binary tree to a doubly linked list.
//---> Here we will traverse over all the node in inOrder traversal manner
//---> And we keep track of last node visited and update the right node of prev node and left node of curr node.
//Time - O(n)
//Space - O(1)

public class A62_ConvertDLL extends A55_BinaryTreeImplementation{

    public static Node head = null , prev = null;

    public static void convertDLL(Node root){
        if(root == null) return;  // Base Case

        convertDLL(root.left);
        if(prev == null){
            head = root;
        }
        else{
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        convertDLL(root.right);
    }

    //Function to print the doubly linked list given its head.
    public static void printTree(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.right;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node root = createTree();

        convertDLL(root);
        printTree();
    }
}
