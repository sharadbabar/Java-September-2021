package practice;
import java.util.Scanner;

public class CalAverage {
    public static void main(String[] args) {
        System.out.println("how many numbers do you want to enter?");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        double[] arr = new double[n];
        double total = 0;

        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter the array element:"+(i+1)+" ");
            arr[i]=scanner.nextDouble();
        }
        scanner.close();


        for(int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }

        double ave = total / arr.length;
        System.out.println("The Average of the given numbers is: "+ ave);


    }
}
