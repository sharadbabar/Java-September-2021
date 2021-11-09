package practice;

import java.util.Scanner;

public class ExampleTest {

    public static void main(String[] args) {
        String str;
        int sum = 0;
        int num;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter your number-->");
            num = scanner.nextInt();
            sum = sum + num;
            System.out.println("Do you want to continue...?");
            str = scanner.next();
        } while (!str.equals("no"));

        System.out.println("Sum-->" + sum);
    }
}


