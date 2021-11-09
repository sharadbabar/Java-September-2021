package diwaliassignment;

import java.util.Scanner;

public class Q9 {
    int area;
    int perimeter;
    int length;
    int breadth;

    public static void main(String[] args) {
        Q9 obj = new Q9();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Length in cm-->");
        obj.length = scanner.nextInt();
        System.out.println("Enter the Breadth in cm-->");
        obj.breadth = scanner.nextInt();
        obj.area();
        obj.perimeter();


    }

    public void area() {
        area = length * breadth;
        System.out.println("Area is = " + area + "sqcm");


    }

    public void perimeter() {
        perimeter = 2 * (length + breadth);
        System.out.println("Perimeter is = " + perimeter + "cm");

    }
}
