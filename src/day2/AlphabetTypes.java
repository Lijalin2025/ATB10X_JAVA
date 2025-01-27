package day2;

import java.util.Scanner;

public class AlphabetTypes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input : ");
        String input = sc.next();

       input =  input.toLowerCase();
        int totalVowels = 0;
        int totalConsoant = 0;

        for (int i=0;i<input.length();i++)
        {
            char IC = input.charAt(i);
            if(Character.isLetter(IC)) {
                if (IC == 'a' || IC == 'i' || IC == 'e' || IC == 'o' || IC == 'u') {
                    totalVowels++;
                } else {
                    totalConsoant++;
                }
            }
        }
        System.out.println("Total vowels : "+totalVowels);
        System.out.println("Total Consoant : "+totalConsoant);
    }
}
