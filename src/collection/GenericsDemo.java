package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(23);
        list.add(26);
        list.add(29);

        List<String> list2 = new ArrayList<>();
        list2.add("Pune");
        list2.add("Nashik");
        list2.add("Delhi");
        list2.add("Mumbai");


        iterate(list2);
        iterate(list);

    }

    private static void iterate(List<?> list){
        list.forEach(s->{
            System.out.println(s);
        });
    }
}
//how hash map works internally