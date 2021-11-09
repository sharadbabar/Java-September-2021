package diwaliassignment;

import java.util.Scanner;

public class Q12 {
    int subject[]=new int[6];
    int total;
    double average;

    public void total(){
        for (int i=0;i<6;i++){
            total=total+subject[i];
        }
        System.out.println("The total is = "+total);
    }

    public void average(){
        average=total/6;
        System.out.println("The Average = "+average);
    }
    public void elements(){
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<6;i++){
//            System.out.println("hello");
            System.out.println("Enter the "+i+" subject marks");
            subject[i]=scanner.nextInt();
        }
    }

    public static void main(String[] args) {
        Q12 obj=new Q12();
        obj.elements();
        obj.total();
        obj.average();
    }
}
