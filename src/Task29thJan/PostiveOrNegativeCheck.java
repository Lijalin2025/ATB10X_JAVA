package Task29thJan;

import java.util.Scanner;

public class PostiveOrNegativeCheck {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input : ");
        int input = sc.nextInt();

        if(input>0)
        {
            System.out.println(input+" is a positive number");
        }
        else if (input==0)
        {
            System.out.println("0 is a neutral number");
        }
        else {
            System.out.println(input+" is a negative number");
        }

    }
}
