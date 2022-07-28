package DSATWO;

//Printing Top and Bottom View of a binary tree
//Time - O(n)   &&   Space - O(n)

import java.util.*;

public class A61_TopBottomViewTree extends A55_BinaryTreeImplementation{

    //Structure of Class Pair to store both node and horizontal distance.
    static class Pair{
        int hdist;
        Node node;
        Pair(int dist , Node node){
            this.hdist = dist;
            this.node = node;
        }
    }

    //Top View of a Binary Tree
    public static void topView(Node root){
        Queue<Pair> q = new ArrayDeque<>();
        HashMap<Integer , Integer> map = new HashMap<>();

        q.add(new Pair(0 , root));
        while(!q.isEmpty()){
            Pair curr = q.poll();

            if(!map.containsKey(curr.hdist)){
                map.put(curr.hdist , curr.node.data);
            }

            if(curr.node.left != null){
                q.add(new Pair(curr.hdist - 1 , curr.node.left));
            }
            if(curr.node.right != null){
                q.add(new Pair(curr.hdist + 1 , curr.node.right));
            }

        }
        TreeMap<Integer , Integer> res = new TreeMap<>();
        res.putAll(map);

        for(Map.Entry<Integer , Integer> entry : res.entrySet()){
            System.out.print(entry.getValue());
        }
        System.out.println();
    }

    //Bottom View of a Binary Tree.
    public static void bottomView(Node root){
        Queue<Pair> q = new ArrayDeque<>();
        HashMap<Integer , Integer> map = new HashMap<>();

        q.add(new Pair(0 , root));
        while(!q.isEmpty()){
            Pair curr = q.poll();

            map.put(curr.hdist , curr.node.data);

            if(curr.node.left != null){
                q.add(new Pair(curr.hdist - 1 , curr.node.left));
            }

            if(curr.node.right != null){
                q.add(new Pair(curr.hdist + 1 , curr.node.right));
            }
        }
        TreeMap<Integer , Integer> res = new TreeMap<>();
        res.putAll(map);
        for(Map.Entry<Integer , Integer> entry : res.entrySet()){
            System.out.print(entry.getValue() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node root = createTree();

        topView(root);
        bottomView(root);

    }
}
