package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambadaExpression {
    public static void main(String[] args) {

        MyInterface myInterface=()->{
            return "in Message";
        };

        System.out.println(myInterface.msg());

        List<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Consumer<Integer> consumer= (integer)-> {
                System.out.println(integer);
            };


        list.forEach(consumer);

    }

}
@FunctionalInterface
interface MyInterface{
    String msg();

}


///anonymous inner class??

//functional interface??