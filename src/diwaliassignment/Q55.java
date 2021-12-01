package diwaliassignment;

import java.util.Scanner;

public class Q55 {
    int height;
    int width;
    int depth;

    public void cube(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the height");
        height=scanner.nextInt();

        System.out.println("Enter the width");
        width=scanner.nextInt();

        System.out.println("Enter the depth");
        depth=scanner.nextInt();


        int cube=height*width*depth;
        System.out.println("The cube is--> "+cube);

    }
    public static void main(String[] args) {
        Q55 obj=new Q55();
        obj.cube();
    }
}
