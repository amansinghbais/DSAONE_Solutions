package DSATWO;

public class A56_TreeTraversals extends A55_BinaryTreeImplementation {

    //PreOrder Traversal
    public static void preOrder(Node root){
        if(root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //InOrder Traversal
    public static void inOrder(Node root){
        if(root == null) return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    //PostOrder Traversal
    public static void postOrder(Node root){
        if(root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
    public static void main(String[] args) {
        System.out.println("Enter root");
        Node root = createTree();

        System.out.print("PreOrder Traversal: ");
        preOrder(root);
        System.out.println();

        System.out.print("InOrder Traversal: ");
        inOrder(root);
        System.out.println();

        System.out.print("PostOrder Traversal: ");
        postOrder(root);
        System.out.println();
    }
}
