package Task29thJan;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your input");

        char input = sc.next().charAt(0);
        input = Character.toLowerCase(input);

        if(input=='a' || input=='e'|| input=='i'|| input=='o'|| input=='u')
        {
            System.out.println(input+" is a vowel");
        }
        else
        {
            System.out.println(input+" is a Consonant");
        }


    }
}
