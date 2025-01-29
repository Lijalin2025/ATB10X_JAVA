package day2;

import java.util.Scanner;

public record Palindrome() {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input : ");
        String input = sc.next();
       input = input.toLowerCase();
       

        StringBuilder rev_input =new StringBuilder(input);
        StringBuilder newIN = rev_input.reverse();
        if(input.equals(String.valueOf(newIN)))
        {
            System.out.println("it's a Palindrome string");
        }
        else
        {
            System.out.println("It's not Palindrome string");
        }


    }
}
