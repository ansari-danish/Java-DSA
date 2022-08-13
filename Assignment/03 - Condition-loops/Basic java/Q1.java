
//Take a input from user and find Area of Circle;;;;

import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.println("Enter a radius of circle");
        double radius = in.nextInt();
        float pie = 3.14f;
        double area = pie*(radius*radius);
        System.out.println("Area of Circle is: "+area);
    }
}
