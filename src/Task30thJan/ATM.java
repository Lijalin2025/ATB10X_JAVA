package Task30thJan;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        int TotalBalance = 10000;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Withdrawal amount : ");
        int Amount = sc.nextInt();

        if(Amount>0 && Amount%100==0 && Amount!=TotalBalance)
        {
            System.out.println("The Updated balance : "+(TotalBalance-Amount));
        }
        else
        {
            System.out.println("withdrawal fails");
        }
    }
}
