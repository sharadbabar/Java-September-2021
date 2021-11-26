package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {


        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Pune");
        map.put(2,"Mumbai");
        map.put(3,"Nagpur");


        Map<Integer,String> map2=new HashMap<>();
        map2.put(1,"Vada Pav");
        map2.put(2,"Momo");
        map2.put(3,"Naturals Ice cream");


        Map<Integer,String> map3=new HashMap<>();
        map3.put(1,"Sharad");
        map3.put(2,"Hemant");
        map3.put(3,"Babar");


        List<Map> list=new ArrayList<>();
        list.add(map);
        list.add(map2);
        list.add(map3);

        list.forEach(s->{
            s.forEach((k,v)->{
                System.out.println(k+" "+v);
            });
            System.out.println();
        });



    }
}
//abbcdepp