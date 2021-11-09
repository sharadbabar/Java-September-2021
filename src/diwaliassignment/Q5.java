package diwaliassignment;
//Convert  number of days into year,week,days

import java.util.Scanner;

public class Q5 {
    int daysToConvert;
    int years;
    int weeks;
    int days;


    public void convert(int daysToConvert) {
        years = daysToConvert / 365;
        daysToConvert = daysToConvert % 365;
        weeks = daysToConvert / 7;
        daysToConvert = daysToConvert % 7;
        days = daysToConvert;

        System.out.println("Years-->"+years);
        System.out.println("Weeks-->"+weeks);
        System.out.println("Days-->"+days);

    }

    public static void main(String[] args) {
        Q5 obj= new Q5();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of days= ");
        obj.daysToConvert= scanner.nextInt();
        obj.convert(obj.daysToConvert);

    }
}
