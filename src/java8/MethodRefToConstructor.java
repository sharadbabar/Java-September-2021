package java8;

public class MethodRefToConstructor {
    public static void main(String[] args) {
        MyInterface4 myInterface4=MethodRefToConstructor::new;



    }
    public MethodRefToConstructor(){
        System.out.println("In constructor");
    }
}


interface  MyInterface4{
    MethodRefToConstructor methodRef();

}

