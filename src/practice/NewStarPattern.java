package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class NewStarPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= 4; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//List<Integer> list1= Arrays.asList(1,2,3,4,5);
//List<Integer> list1= Arrays.asList(5,4,3,2,1);

