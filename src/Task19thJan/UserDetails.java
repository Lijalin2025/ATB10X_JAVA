package Task19thJan;

import java.util.Scanner;

public class UserDetails {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String Name = scanner.next();
        System.out.println("Enter your Age : ");
        int Age = scanner.nextInt();
        System.out.println("Enter your Salary : ");
        int Salary = scanner.nextInt();

        System.out.println("Your name is : "+Name);
        System.out.println("Your Age is : "+Age);
        System.out.println("Your Salary is : "+Salary);



    }
}
