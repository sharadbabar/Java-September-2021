package diwaliassignment;

import java.util.Scanner;

public class Q6 {

    int n;
    int m;

    public static void main(String[] args) {
        Q6 obj = new Q6();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First number-->");
        obj.n = scanner.nextInt();
        System.out.println("Enter the Second number-->");
        obj.m = scanner.nextInt();

        System.out.println("The division is-->" + obj.n / obj.m);

    }
}
