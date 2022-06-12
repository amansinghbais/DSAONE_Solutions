package DSAONE;

import java.util.HashSet;
import java.util.Set;

public class A27_hashSet {
    //Find the distinct element in array using hashSet
    //Here we add all the element of array a and at end return the size of the set which don't contains duplicate
    //elements.
    public static int distinctElement(int[] a){
        Set<Integer> set = new HashSet<>();
        for(int x : a){
            set.add(x);
        }
        return set.size();
    }

    //Finding union of two array , Adding all elements of both the array in a hashSet and return size of set.
    public static int union(int[] a , int[] b){
        Set<Integer> set = new HashSet<>();
        for(int x: a){
            set.add(x);
        }
        for(int y: b){
            set.add(y);
        }
        return set.size();
    }

    //Finding no. of element in  intersection of elements in a & b
    //We add all element of a in set and now iterate over b and if element in b already in set we increment the
    //count and remove that element from the set.
    public static int intersection(int[] a , int[] b){
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for(int i : a){
            set.add(i);
        }
        for(int j : b){
            if(set.contains(j)){
                count++;
                set.remove(j);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {5,10,15,5,4,5};
        int[] b = {5,10,15,4};

        System.out.print("The no. distinct element in array A are ");
        System.out.println(distinctElement(a));
        System.out.println();

        System.out.print("The Union of array A & array B have ");
        System.out.println(union(a , b) + " elements.");
        System.out.println();

        System.out.print("The Intersection of Array A & B have ");
        System.out.println(intersection(a , b) + " elements.");

    }
}
