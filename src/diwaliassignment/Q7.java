package diwaliassignment;

public class Q7 {
    int num1=20;
    int num2=10;
    int sum;
    int sub;
    int mul;
    double div;

    public void operationDemo(){
        sum=num1+num2;
        sub=num1-num2;
        div=num1/num2;
        mul=num1*num2;
        System.out.println("Sum-->"+sum);
        System.out.println("Sub-->"+sub);
        System.out.println("Mul-->"+mul);
        System.out.println("Div-->"+div);



    }

    public static void main(String[] args) {
        Q7 obj=new Q7();
        obj.operationDemo();
    }
}
