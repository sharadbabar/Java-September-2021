package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10476);
        list.add(10);
        list.add(106);
        list.add(476);
        list.add(16);
        list.add(1);


        Collections.sort(list);
        System.out.println(list);
        System.out.println();

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
