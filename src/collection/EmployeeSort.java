package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSort implements Comparable<EmployeeSort> {
    int id;
    String name;
    String address;

    public EmployeeSort(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        EmployeeSort e1=new EmployeeSort(1,"Sharad","Pune");
        EmployeeSort e2=new EmployeeSort(3,"Ram","Mumbai");
        EmployeeSort e3=new EmployeeSort(2,"Hemant","Nashik");

        List<EmployeeSort> list=new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);

        Collections.sort(list);
        list.forEach(s->{
            System.out.println(s.id+" "+s.name+" "+s.address);
        });

    }

    @Override
    public int compareTo(EmployeeSort empSort) {
        if (this.id==empSort.id){
            return 0;

        }else if (this.id> empSort.id){
            return 1;

        }else{
            return -1;
        }
    }
}
