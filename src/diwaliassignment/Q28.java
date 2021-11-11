package diwaliassignment;

import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n=5;
        int arr[]=new int[n];
        System.out.println("Enter marks of 5 subjects");

        for (int j=0;j<arr.length;j++){
            arr[j]= scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
