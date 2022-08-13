// Take a input from user and Area of Equilateral Triangle;;;;
import java.util.*;


public class Q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a side value: ");
    double side = in.nextDouble();
        double area = (Math.sqrt(3)/4)*side *side;
        System.out.print("Area of a equilateral triangle is: "+area);
    }
}
