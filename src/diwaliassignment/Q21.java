package diwaliassignment;

import java.util.Scanner;

public class Q21 {
    char alpha;
    public static void main(String[] args) {
        Q21 obj=new Q21();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the character");
        obj.alpha=scanner.next().charAt(0);
        if (obj.alpha=='a'||obj.alpha=='e'||obj.alpha=='i'||obj.alpha=='o'||obj.alpha=='u'){
            System.out.println(obj.alpha+" is a vowel");

        }else{
            System.out.println(obj.alpha+" is a consonant");

        }


    }
}
