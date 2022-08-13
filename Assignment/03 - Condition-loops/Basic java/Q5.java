//Take a input from user and print Area of Parellelogram;;;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a length ");
        double length = in.nextDouble();
        System.out.print("Enter a width ");
        double width = in.nextDouble();
        double area = length*width;
        System.out.println("Area of a Parellelogram is: "+area);
    }
}
