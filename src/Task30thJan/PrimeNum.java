package Task30thJan;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input : ");
        int num = sc.nextInt();
        int MiddleNum = num/2;

        if (num<=0 || num ==1 ) {
            System.out.println(num + " is not a prime number");
        }
        else {
            for (int i =2;i<=MiddleNum;i++)
            {
                if (num%i==0)
                {
                    count++;
                }

            }
            if (count==2){
                System.out.println(num+" is a Prime number");
            }
            else {
                System.out.println(num+" is not a Prime number");
            }
        }



    }
}
