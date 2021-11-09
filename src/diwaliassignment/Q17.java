package diwaliassignment;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a -->");
        a=scanner.nextInt();
        System.out.println("Enter b -->");
        b=scanner.nextInt();
        System.out.println("Enter c -->");
        c=scanner.nextInt();

        if (a>b&&a>c){
            System.out.println("a is The greatest");
        }else if(b>a&&b>c){
            System.out.println("b is greater");
        }else{
            System.out.println("c is bigger");
        }

        if (a<b&&a<c){
            System.out.println("a The smallest");
        }else if(b<a&&b<c){
            System.out.println("b is smallest");
        }else{
            System.out.println("c is smallest");
        }
    }

}
