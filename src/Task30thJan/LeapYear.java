package Task30thJan;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year");

        int Year = sc.nextInt();

        String result = (Year%4==0)?"It's a Leap Year" : "It's not a Leap year";
        System.out.println(result);
    }
}
