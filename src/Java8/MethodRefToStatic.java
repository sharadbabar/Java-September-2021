package Java8;

public class MethodRefToStatic {
    public static void main(String[] args) {

        MyInterface5 myInterface5=MethodRefToStatic::display;
        System.out.println(myInterface5.msg());

    }
    public static String display(){
        return "Hello";

    }

}

interface  MyInterface5{
    String msg();

}
//defaul and static keyword?
//
//rules for functional interface
//private method in interfaces
//
//if methods are private in interface what is the use
//
//count the number of 0 and 1 in the integer number eg.0101010101010100001111100011
