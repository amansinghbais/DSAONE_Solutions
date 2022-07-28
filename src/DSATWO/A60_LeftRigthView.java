package DSATWO;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

//Print Left View and Right View of a Binary Tree.

public class A60_LeftRigthView extends A55_BinaryTreeImplementation{

    //Left View using Recursion
    //Time - O(n)   && Space - O(n) due to recursion stack.
    static int max_level = 0;
    public static void leftView(Node root){
        printleftView(root , 1);
    }

    public static void printleftView(Node root , int level){
        if(root == null) return;

        if(max_level < level){
            System.out.print(root.data + " ");
            max_level = level;
        }
        printleftView(root.left , level + 1);
        printleftView(root.right , level + 1);
    }

    //Left View using the queue
    //Time - O(n)   &&   Space - O(n)
    public static void leftViewUsingQueue(Node root){
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();

            for(int i = 0 ; i < n ; i++){
                Node curr = q.poll();
                if(i == 0){
                    System.out.print(curr.data + " ");
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
        System.out.println();

    }
    //-------------------------------------------------------------------

    //Right using hashing
    //Time - O(n)  && Space - O(n) because of hashing stack
    public static void rightView(Node root){
        HashMap<Integer , Integer> map = new HashMap<>();
        returnRightView(root , 0 ,  map);

        for(int i = 0 ; i  < map.size() ; i++){
            System.out.print(map.get(i) + " ");
        }
        System.out.println();
    }

    public static void returnRightView(Node root , int level , HashMap<Integer , Integer> map){
        if(root == null) return;

        map.put(level , root.data);

        returnRightView(root.left , level + 1 , map);
        returnRightView(root.right , level + 1 , map);
    }

    //Right view using Queue
    //Here we use Level Order Traversal
    //Time - O(n)  &&   Space - O(n)
    public static void rightViewUsingQueue(Node root){
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int n = q.size();
            for(int i = 0 ; i < n ; i++){
                Node curr = q.poll();
                if(i == n - 1){
                    System.out.print(curr.data + " ");
                }

                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node root = A55_BinaryTreeImplementation.createTree();

        leftView(root);
        System.out.println();
        leftViewUsingQueue(root);

        rightView(root);
        rightViewUsingQueue(root);

    }
}
