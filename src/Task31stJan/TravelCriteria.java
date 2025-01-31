package Task31stJan;

import java.util.Scanner;

public class TravelCriteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Age");
        int Age = sc.nextInt();

        System.out.println("Is your Visa active ?");
        boolean VisaStatus = sc.nextBoolean();

        if (Age > 18 && VisaStatus)
        {
            System.out.println("You are eligible for travel");
        }
        else
        {
            System.out.println("You are not eligible");
        }


    }
}
