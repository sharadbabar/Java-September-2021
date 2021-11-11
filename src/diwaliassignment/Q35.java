package diwaliassignment;

import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        int num;
        int result=1;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number-->");
        num=scanner.nextInt();


        while(num!=1){
            result=num*result;
            num--;
        }
        System.out.println("the factorial is = "+result);
    }
}
