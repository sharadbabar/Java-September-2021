package scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        int num;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number.....");
        num=scanner.nextInt();
        System.out.println("Your number is==>"+num);
    }
}
