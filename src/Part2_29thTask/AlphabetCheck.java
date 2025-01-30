package Part2_29thTask;

import java.util.Scanner;

public class AlphabetCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input");
        char input = sc.nextLine().charAt(0);
        input = Character.toLowerCase(input);

        if (Character.isAlphabetic(input))
        {
            System.out.println("It's an Alphabet ");
        }
        else {
            System.out.println("It's not an Alphabet");
        }
    }
}
