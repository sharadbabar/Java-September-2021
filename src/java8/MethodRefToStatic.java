package java8;

public class MethodRefToStatic {
    public static void main(String[] args) {

        MyInterface5 myInterface5=MethodRefToStatic::display;   //refer

        System.out.println(myInterface5.msg()); //call

    }
    public static String display(){
        return "Hello";

    }

}

interface  MyInterface5{
    String msg();

}
//default and static keyword?
//
//rules for functional interface
//private method in interfaces
//-->cannot be abstract and can be used inside the interface only.
//
//if methods are private in interface what is the use
// these methods can be only used inside the interface, for confidential code
//
//count the number of 0 and 1 in the integer number eg.0101010101010100001111100011
