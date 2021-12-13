package java8;

import java.util.ArrayList;
import java.util.List;

public class MethodReferences {
    public static void main(String[] args) {
        //method ref to instance method
        MethodReferences obj=new MethodReferences();

        Myinterface3 myinterface3=obj::display; //refer

        System.out.println(myinterface3.msg()); //call


        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(23);
        list.add(26);
        list.add(29);

        list.forEach(System.out::println);


    }


    public String display(){

        return "hiii";
    }
}
@FunctionalInterface
interface  Myinterface3{
    String msg();
}

//only works with functional interface