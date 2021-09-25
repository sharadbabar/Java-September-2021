package array;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {


        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
