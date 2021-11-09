package diwaliassignment;

public class Q4 {
    int num1=10;
    int num2=20;
    int temp;
    public void swap(){
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("First number-->"+num1+"\nSecond number-->"+num2);
    }

    public static void main(String[] args) {
        Q4 obj=new Q4();
        System.out.println("First number-->"+obj.num1+"\nSecond number-->"+obj.num2);
        System.out.println("");
        obj.swap();
    }
}
