package collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);


        System.out.println(set.remove(20));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        System.out.println(set.contains(30));
        System.out.println(set);
    }
}


    /**
     *
     * Tree set?
     *
     *
     * HI LAI SHANI
     *
     */
