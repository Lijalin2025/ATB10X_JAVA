package Task31stJan;

import java.util.Scanner;

public class PalinDromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();

        String newNum = num+"";
        StringBuilder num2 = new StringBuilder(newNum);
        StringBuilder revStr = num2.reverse();

        if(newNum.equals(String.valueOf(revStr)))
        {
            System.out.println(" It's palindrome number");
        }
        else {
            System.out.println("It's not a palindrome number");
        }
    }
}
