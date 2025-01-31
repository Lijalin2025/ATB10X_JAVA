package Task31stJan;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user's unit");
        int unit = sc.nextInt();
        double TotalBill = 0;

        if(unit<101)
        {
            TotalBill = unit*0.50;
        }
        else if (unit<201)
        {
            TotalBill = unit*0.75;
        }
        else if (unit<301)
        {
            TotalBill = unit*1.20;
        }
        else
        {
            TotalBill = unit*1.50;
        }
        System.out.println("Total electricity bill : "+TotalBill);
    }
}
