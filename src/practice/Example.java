package practice;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        int num;
        int guess;
        num = (int) (Math.random() * 10);
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Guess the number...");
            guess = scanner.nextInt();
            if (guess < num) {
                System.out.println("Number is Greater");
            }
            else if (guess>num){
                System.out.println("Number is Smaller");
            }
            else{
                System.out.println("Correct Guess!!!!!");
            }
        } while (guess != num);
    }
}
