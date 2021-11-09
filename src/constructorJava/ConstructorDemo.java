package constructorJava;

public class ConstructorDemo {
    int id;
    String name;
    boolean flag;


    public ConstructorDemo() {
        System.out.println("Inside Constructor ID-->" + id + " Name-->" + name + " Flag-->" + flag);
    }

    public ConstructorDemo(int i) {
        System.out.println("In Parameterized Constructor");
    }

    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo();
        ConstructorDemo obj2 = new ConstructorDemo(9);
    }
}


/**
 * Constructor is a special type of function
 * which is invoked automatically when the object of the class is created
 * Rules-->1. Class name and the constructor name should be same
 * 2.There should be no return type to constructor
 * 3.Final,Static,syncronized keywords are used  with container
 */