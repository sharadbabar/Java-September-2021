package diwaliassignment;

import java.util.Scanner;

//Write a program to print the area and perimeter of a circle.
public class Q8 {
    double radius;
    double area;
    double perimeter;
   final double pi=3.14;
    public void area(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the radius-->");
        radius= scanner.nextInt();
        area=pi*radius*radius;
        System.out.println("The Area of the circle is-->"+area);
        perimeter=2*pi*radius;
        System.out.println("The Perimeter is-->"+perimeter);
    }

    public static void main(String[] args) {
        Q8 obj=new Q8();
        obj.area();

    }
}
