package Task30thJan;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of 3 sides of your Triangle");

        float sideA = sc.nextFloat();
        float sideB = sc.nextFloat();
        float sideC = sc.nextFloat();

        if(sideA+sideB>sideC && sideA+sideC>sideB && sideB+sideC>sideA)
        {
            System.out.println("Triangle is Valid Based on Three Sides");
        }
        else {
            System.out.println("Triangle is not Valid Based on Three Sides");
        }
    }
}
