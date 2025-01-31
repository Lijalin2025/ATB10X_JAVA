package Task31stJan;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Salary");
        int salary = sc.nextInt();
        System.out.println("Enter your Experience");
        float Experience = sc.nextFloat();

        double Bonus = 0.0;

        if(Experience<1)
        {
            Bonus = 0;
        } else if (Experience<=3)
        {
            Bonus = salary*0.05;
        }
        else if (Experience >= 4 && Experience <= 6)
        {
            Bonus = salary*0.10;
        }
        else
        {
            Bonus = salary*0.15;
        }
        System.out.println("Your total bonus is : "+Bonus);
    }
}