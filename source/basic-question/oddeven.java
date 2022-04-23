//Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
        int num;
        System.out.println("enter number u want to check");
        num = in.nextInt();
        if(num % 2 ==0)
            System.out.println("this is even number");
        else
            System.out.println("this is odd number");
    }
}
