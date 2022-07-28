package DSATWO;

//Find the Lowest Common Ancestor for two nodes in a binary tree.
//Time -  O(n)

public class A64_LowestCommonAncestor extends A55_BinaryTreeImplementation{

    public static Node lca(Node root , int n1 , int n2){
        if(root == null) return null;
        if(root.data == n1 || root.data == n2) return root;

        Node left = lca(root.left , n1 , n2);
        Node right = lca(root.right , n1 , n2);

        if(left == null) return right;
        if(right == null) return left;

        return root;
    }

    public static void main(String[] args) {
        Node root = createTree();

        Node res = lca(root , 20 , 40);
        System.out.println(res.data);

    }
}
