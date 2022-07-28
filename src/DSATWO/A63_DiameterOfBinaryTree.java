package DSATWO;

//Diameter of a Binary Tree
//No. of nodes in the largest path between two leaf nodes
//Time - O(n)

public class A63_DiameterOfBinaryTree extends A55_BinaryTreeImplementation {
    //First Approach
    public static int diameter(Node root){
        if(root == null) return 0;
        int left = diameter(root.left);
        int right = diameter(root.right);
        int curr = height(root.left) + height(root.right) + 1;

        return Math.max(curr , Math.max(left , right));
    }

    public static int height(Node root){
        if(root == null) return 0;

        return Math.max(height(root.left) , height(root.right)) + 1;
    }

    //Second Approach Using modified Height Function
    public static int ans = 0;
    public static int heightApproach(Node root){
        if(root == null) return 0;
        int lh = heightApproach(root.left);
        int rh = heightApproach(root.right);

        ans = Math.max(ans , lh + rh + 1);

        return 1 + Math.max(lh , rh);
    }

    public static void main(String[] args) {
       Node root =  createTree();

//       int res = diameter(root);
        int res = heightApproach(root);
        System.out.println(res);
    }



}
