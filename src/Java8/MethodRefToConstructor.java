package Java8;

public class MethodRefToConstructor {
    public static void main(String[] args) {

        MyInterface4 myInterface4=MyClass::new;
        myInterface4.myRef();

    }
}
class MyClass{
    MyClass(){
        System.out.println("In MyClass");
    }
}

interface  MyInterface4{
    MyClass myRef();

}