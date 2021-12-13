package java8;

public class DefaultAndStatic implements MyInterface6 {

    public static void main(String[] args) {
        DefaultAndStatic obj = new DefaultAndStatic();
        System.out.println(obj.str());
        System.out.println(obj.add(8, 9));
        System.out.println(MyInterface6.sub(9, 2));

    }
    @Override
    public String str() {
        return "Hello";
    }

}

interface MyInterface6 {
    static int sub(int a, int b) {
        return a - b;
    }

    String str();

    default int add(int a, int b) {
        return a + b;
    }
}
/**
 * By using the default keyword , we can define a method into the interface.
 * use of default and static keyword is "without modifying all the classes you can add a method to the interface using default and static
 */