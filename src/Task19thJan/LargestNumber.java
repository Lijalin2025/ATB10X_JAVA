package Task19thJan;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your 3 numbers : ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        String LargestNum = (A>B)?"A":(B>C)?"B":"C";
        System.out.println("The largest number is : "+LargestNum);
        scanner.close();



    }

}
