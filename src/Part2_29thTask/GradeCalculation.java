package Part2_29thTask;

import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your total Marks");
        int Marks = sc.nextInt();

        if (0<Marks && Marks<=100)
        {
           if (Marks>=90)
           {
               System.out.println("A+ Grade");
           } else if (Marks>80) {
               System.out.println("A Grade");
           } else if (Marks>70) {
               System.out.println("B Grade");
           } else if (Marks>60) {
               System.out.println("C grade");
           } else if (Marks>50) {
               System.out.println("D grade");
           } else if (Marks>40) {
               System.out.println("E Grade");

           } else {
               System.out.println("Fail");
           }
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}
