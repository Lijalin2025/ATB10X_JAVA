package Task19thJan;

import java.util.Scanner;

public class HigestNumBetween2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your 1st number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter your 2nd number : ");
        int num2 = scanner.nextInt();

        int HighestNum = (num1 > num2) ? num1 : num2;
        System.out.println("Higest number is : " + HighestNum);
    }
}
