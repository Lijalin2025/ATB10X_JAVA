package Part2_29thTask;

import java.util.Scanner;

public class SmallestAmong3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 3 inputs :");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = (a<b)?((a<c)?a:c):(b<c)?b:c;
        System.out.println(result+" is the smallest");

    }

}

