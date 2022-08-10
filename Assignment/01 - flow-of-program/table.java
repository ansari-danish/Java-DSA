// Take a number as input and print the multiplication table for it;;;;;

import java.util.Scanner;

public class table  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int num = in.nextInt();
        for (int i = 1;i<11;i++){
            System.out.println(num +" x "+ i+" = " + num * i);
        }
    }
}
