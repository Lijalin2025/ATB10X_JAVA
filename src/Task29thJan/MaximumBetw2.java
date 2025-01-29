package Task29thJan;

import java.util.Scanner;

public class MaximumBetw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your 1st input : ");
        int input1 = sc.nextInt();

        System.out.println("Enter your 2nd input : ");
        int input2 = sc.nextInt();

        //int result = Math.max(input1,input2);
        //System.out.println(result+" is maximum ");

        String result = (input1>input2)?input1+" is maximum ":input2+" is maximum ";
        System.out.println(result);

    }
}
