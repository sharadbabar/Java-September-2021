package collection;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer>treeSet=new TreeSet<>();

        treeSet.add(12);
        treeSet.add(13);
        treeSet.add(14);
        treeSet.add(15);
        treeSet.add(18);
        System.out.println(treeSet.subSet(12,16));
        System.out.println(treeSet.tailSet(14,false));
        System.out.println(treeSet.higher(15));
        System.out.println(treeSet.lower(15));
        System.out.println(treeSet.ceiling(17));
        System.out.println(treeSet.floor(17));
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet.pollLast());
        System.out.println(treeSet);

    }
}
