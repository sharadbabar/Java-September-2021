package diwaliassignment;

import java.util.Scanner;

// Write a program to find sum of all digits of a number entered by the user.
public class Q37 {
    public static void main(String[] args) {
        int digit;
        int sum=0;
        int number;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number-> ");
        number=scanner.nextInt();
        while (number!=0){
            digit=number%10;
            sum=sum+digit;
            number=number/10;

        }
        System.out.println("The sum is ="+sum);

    }
}
