package diwaliassignment;

import java.util.Scanner;

public class Q30 {
    int num;
    int power;
    int result = 0;

    public static void main(String[] args) {
        Q30 obj = new Q30();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number-->");
        obj.num = scanner.nextInt();
        System.out.println("Enter the power of the number-->");
        obj.power = scanner.nextInt();
        obj.result = obj.num;  //load the number into the result because the multiplying anything with result
                                //would make it 0, as result is initialized to zero
        for (int i = 1; i < obj.power; i++) {       // the number is already loaded into the result so we need
                                                    //iteration less in the for loop... so we start with 1
            obj.result = obj.result * obj.num;

        }
        System.out.println(obj.result);

    }
}
