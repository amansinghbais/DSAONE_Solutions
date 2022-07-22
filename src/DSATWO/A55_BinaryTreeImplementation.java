package DSATWO;
import java.util.Scanner;

//Implemtation of Binary Tree using Node.

//Node Class for tree..........
class Node{
    Node left , right;
    int data;
    public Node(int data){
        this.data = data;
    }
}

public class A55_BinaryTreeImplementation {
    public static Scanner scan = new Scanner(System.in);

    //Function to take input from user and creating a tree with the data.
    public static Node createTree(){
        int data = scan.nextInt();

        if(data == -1) return null;

        Node root = new Node(data);

        System.out.println("Enter left for " + data);
        root.left = createTree();

        System.out.println("Enter right for " + data);
        root.right = createTree();

        return root;
    }

    public static void main(String[] args) {
        System.out.print("Enter Root:");
        Node root = createTree();

    }
}
