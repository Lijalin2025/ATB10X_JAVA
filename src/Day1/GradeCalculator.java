package Day1;

import java.util.Scanner;

public class GradeCalculator {

    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score : ");
        int Score = input.nextInt();

        String grade = (Score >= 90)?"A":(Score>=80)?"B":(Score>=70)?"C":(Score>=60)?"D":"E";
        System.out.println("Enter your grade is : "+grade);
        input.close();

    }
}
