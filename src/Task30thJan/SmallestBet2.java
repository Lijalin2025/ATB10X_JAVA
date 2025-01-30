package Task30thJan;

import java.util.Scanner;

public class SmallestBet2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 2 inputs :");

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        String result = (input1 < input2) ? input1 + " is the smallest" : input2 + " is the smallest";
        System.out.println(result);
    }
}
