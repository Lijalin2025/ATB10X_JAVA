package Task31stJan;

import java.util.Scanner;

public class EmployeeNetSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee's basic salary :");
        int BasicPay = sc.nextInt();

        //Befits
        double HRA = BasicPay*0.40;
        double Bonus = BasicPay*0.10;

        //deduction
        Double Tax = 0.0;
        double PFWithInsurance = (BasicPay*0.12)*12;

        //CTC
        double grossSalary = (BasicPay+HRA+Bonus)*12;
        double netSalary = 0.0;

        if(grossSalary<500000)
        {
             netSalary = grossSalary-PFWithInsurance;
        }
        else if (grossSalary<=1000000)
        {
             netSalary = grossSalary - (grossSalary*0.10)-PFWithInsurance;
        }
        else if (grossSalary<=2000000)
        {
             netSalary = grossSalary - (grossSalary*0.20)-PFWithInsurance;
        }
        else
        {
             netSalary = grossSalary - (grossSalary*0.30)-PFWithInsurance;
        }
        System.out.println("Your net Salary is "+netSalary);

    }
}
