package diwaliassignment;

import java.util.Scanner;

public class Q2 {
    int num1;
    int num2;
    int sum1;

    public void sum(){
        sum1=num1+num2;

    }
    public static void main(String[] args) {
        Q2 obj=new Q2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        obj.num1=scanner.nextInt();
        System.out.println("Enter the second number");
        obj.num2=scanner.nextInt();
        obj.sum();
        System.out.println("The sum is-->"+obj.sum1);

    }
}


//Parameter passing problem