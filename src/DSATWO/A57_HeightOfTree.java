package DSATWO;

//Finding the height of a binary tree
//Time Complexity - O(n)

public class A57_HeightOfTree extends A55_BinaryTreeImplementation{

    //Function to find height of a binary Tree
    public static int height(Node root){
        if(root == null) return 0;   // We will return -1 if we want to find maxDepth of tree.

        return Math.max(height(root.left) , height(root.right)) + 1;
    }

    public static void main(String[] args) {
        Node root = createTree();

        int res = height(root);
        System.out.println("Height of Following Tree: " + res);
    }
}
