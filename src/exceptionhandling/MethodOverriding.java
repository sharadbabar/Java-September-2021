package exceptionhandling;

public class MethodOverriding {
    public void show() throws Exception{
        System.out.println("In Parent class show");

    }
}
class MethodOverriding2 extends MethodOverriding{
    public void show() throws ArithmeticException{
        System.out.println("In Child class show...");

    }

    public static void main(String[] args) {
        MethodOverriding2 obj=new MethodOverriding2();
        obj.show();
    }
}



//if parent class declare no exception then you can declare unchecked exceptionin child
//if parent class declares exception then you can declare same exception.
//if parent class declares exception then you can declare child exception.
//you cannot declare the parent exception in the child class.
