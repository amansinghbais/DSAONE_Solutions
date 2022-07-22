package DSATWO;

public class A58_SizeAndMaxMin extends A55_BinaryTreeImplementation {

    //Function to find the size of tree(no. of node in a tree)
    public static int sizeOfTree(Node root){
        if(root == null){
            return 0;
        }

        return sizeOfTree(root.left) + sizeOfTree(root.right) + 1;
    }

    //Function to find the max data in a binary tree
    public static int maxTree(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }

        return Math.max(root.data , Math.max(maxTree(root.left) , maxTree(root.right)));
    }

    //Function to find the min data in a binary tree
    public static int minTree(Node root){
        if(root == null){
            return Integer.MAX_VALUE;
        }

        return Math.min(root.data , Math.min(minTree(root.left) , minTree(root.right)));
    }

    public static void main(String[] args) {
        Node root = createTree();

        int size = sizeOfTree(root);
        System.out.println("The Size of Binary Tree: " + size);

        int max = maxTree(root);
        System.out.println("The Max of Tree: " + max);

        int min = minTree(root);
        System.out.println("The Min of Tree: " + min);
    }
}
