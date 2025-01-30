package Part2_29thTask;

import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your total Marks");
        int Marks = sc.nextInt();

        //Grade A = >80%
        //Grade B = >60%
        //Grade C = >40%
        //Grade D = fail
        if (0<Marks && Marks<=100)
        {
           if (Marks>80)
           {
               System.out.println("A Grade");
           } else if (Marks>60) {
               System.out.println("B Grade");
           } else if (Marks>40) {
               System.out.println("C Grade");
           }
           else {
               System.out.println("Fail");
           }
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}
