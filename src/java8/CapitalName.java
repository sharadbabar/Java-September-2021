package java8;

import java.util.Scanner;

public class CapitalName {
    public static void main(String[] args) {
        String str;
        Scanner scanner=new Scanner(System.in);
        str=scanner.next();
        String output = str.substring(0,1).toUpperCase()+str.substring(1);
        System.out.println(output);

    }
}
