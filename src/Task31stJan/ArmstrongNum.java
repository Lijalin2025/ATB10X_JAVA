package Task31stJan;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int num = sc.nextInt();
        int temp = num;
        int sum=0;

       while (num>0)
       {
           int eachDigit = num%10;
           num = num/10;
           sum = sum+(eachDigit*eachDigit*eachDigit);
       }
      if (temp==sum)
      {
          System.out.println("It's an ArmstrongNum");
      }
      else {
          System.out.println("It's not an ArmstrongNum number");
      }

        }
    }

