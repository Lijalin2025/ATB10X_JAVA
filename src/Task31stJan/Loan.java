package Task31stJan;

import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age");
        int Age = sc.nextInt();
        System.out.println("Enter your Salary");
        int Salary = sc.nextInt();
        System.out.println("Enter your Credit Score");
        int CS = sc.nextInt();

        if(Age>17 && Age<79 && Salary>=30000 && CS>649 && CS<849)
        {
            System.out.println("You are eligible for Loan");
        }
        else {
            System.out.println("You are not eligible");
        }
    }
}
