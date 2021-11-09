package exceptionhandling;

public class NestedTryBlock {

    public static void main(String[] args) {
        int i=10;
        int j;
        System.out.println("Hello");
        System.out.println("Hello2");
        System.out.println("Hello3");
        try{
            try{
                System.out.println("Hi");
                String str=null;
                System.out.println(str.length());
            }catch (NullPointerException e) {
                System.out.println(e);
            }
            j=i/0;

        }catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Hello");
        System.out.println("Hello2");
        System.out.println("Hello3");

    }
}


