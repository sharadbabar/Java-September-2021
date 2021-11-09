package exceptionhandling;

public class RecursionDemo {
    public static void main(String[] args) {
        RecursionDemo obj = new RecursionDemo();
        obj.recursion(12);
    }

    public void recursion(int i) {
        System.out.println("Num-->" + i);
        recursion(i);
    }
}
