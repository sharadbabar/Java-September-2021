package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo  {
    int id;
    String name;
    String address;

    public ComparatorDemo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        ComparatorDemo e1=new ComparatorDemo(3,"savi","Pune");
        ComparatorDemo e2=new ComparatorDemo(1,"ruam","Mumbai");
        ComparatorDemo e3=new ComparatorDemo(2,"Hemant","Nashik");

        List<ComparatorDemo> list=new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);

        Comparator<ComparatorDemo> comparatorId=new Comparator<ComparatorDemo>() {
            @Override
            public int compare(ComparatorDemo comparatorDemo, ComparatorDemo t1) {
                if (comparatorDemo.id==t1.id){
                    return 0;
                }else if (comparatorDemo.id>t1.id){
                    return 1;

                }else{
                    return -1;

                }

            }
        };

//        Collections.sort(list);
        list.forEach(s->{
            System.out.println(s.id+" "+s.name+" "+s.address);
        });

    }

//    @Override
//    public int compareTo(ComparatorDemo empSort) {
//        if (this.id==empSort.id){
//            return 0;
//
//        }else if (this.id> empSort.id){
//            return 1;
//
//        }else{
//            return -1;
//        }
//    }
}
