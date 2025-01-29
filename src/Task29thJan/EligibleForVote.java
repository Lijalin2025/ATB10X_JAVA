package Task29thJan;

import java.util.Scanner;

public class EligibleForVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int Age = sc.nextInt();

        String result = (Age>18)?"You are eligible for Vote" : "You are not eligible for vote";
        System.out.println(result);

    }
}
