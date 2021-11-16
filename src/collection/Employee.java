package collection;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    int id;
    String empName;
    String empAddress;
    int salary;

    public Employee(int id, String empName, String empAddress, int salary) {
        this.id = id;
        this.empName = empName;
        this.empAddress = empAddress;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee obj1=new Employee(1,"Sharad","Pune",1000000);
        Employee obj2=new Employee(2,"Swapneel","Pune",1000000);
        Employee obj3=new Employee(3,"Mrunal","Pune",1000000);
        Employee obj4=new Employee(4,"Manisha","Pune",1000000);
        List<Employee> list=new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);

        list.forEach(s ->{
            System.out.println(s.id+" "+s.empName+" "+s.empAddress+" "+s.salary);
        });



    }
}

//Vector from github
