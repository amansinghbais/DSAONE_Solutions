package DSATWO;

//Level Order Traversal Of Binary Tree

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class A59_LevelOrder extends A55_BinaryTreeImplementation{

    public static int height(Node root){
        if(root == null) return 0;

        return Math.max(height(root.left) , height(root.right)) + 1;
    }

    //Appraoch - 1
    //Here we all element at each level by iterating over all level
    //Time Complexity - O(n ^ 2)
    public static void approach1(Node root){
        int n = height(root);
        for(int i = 1 ; i <= n ; i++){
            printCurrentLevel(root , i);
        }
    }

    public static void printCurrentLevel(Node root , int level){
        if(root == null){
            return;
        }
         if(level == 1){
            System.out.print(root.data + " ");
        }else if(level > 1){
            printCurrentLevel(root.left , level - 1);
            printCurrentLevel(root.right , level - 1);
        }
    }

    //Approach - 2 : Using Queue
    //We add both left and right child in queue for every node and print curr node.
    //Time - O(n)
    public static void approach2(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.poll();
            System.out.print(curr.data + " ");

            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
    }


    public static void main(String[] args) {
        Node root = createTree();

//        approach1(root);
        approach2(root);
    }
}
