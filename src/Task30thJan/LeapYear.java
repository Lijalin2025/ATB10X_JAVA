package Task30thJan;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year");

        int Year = sc.nextInt();

        if((Year%4==0 && Year%100!=0) || (Year%400==0))
        {
            System.out.println("It is a Leap year");
        }
        else {System.out.println("It is not a Leap year");
        }
    }
}
