package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 9;
        arr[1] = 9;
        arr[2] = 9;
        arr[3] = 9;

        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(23);
        list.add(26);
        list.add(29);

        List<Integer>list2 =new ArrayList<>(Arrays.asList(123,132,45,13,45));
        list2.add(22);

        List<Integer> list5 =new ArrayList<>(List.of(12,1,13,14));
        List<Integer> list4=new ArrayList<>(){{
            add(12);
            add(14);

        }};

        System.out.println(list.get(1));
        System.out.println(list.remove(1));
        System.out.println(list.size());
        System.out.println(list.contains(29));
        System.out.println(list.isEmpty());

        list.forEach(s -> {
            System.out.println(s);
        });


        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(list);
        //Bit shifting
        //framework means ready made architecture is provided


    }
}
