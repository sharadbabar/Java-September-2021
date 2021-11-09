package exceptionhandling;

public class SimpleTryCatch {
    public static void main(String[] args) {
        int i=10;
        int j;
        System.out.println("Hello");
        System.out.println("Hello2");
        System.out.println("Hello3");
        try{
            j=i/0;

        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Hello");
        System.out.println("Hello2");
        System.out.println("Hello3");

    }
}
