//Curved Surface Area of Cylinder;;;
import java.util.*;
public class Q19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a radius");
        double radius = in.nextDouble();
        System.out.println("Enter a height ");
double height = in.nextDouble();
double area = 2*Math.PI*radius*height;
        System.out.println("Area of Curved Surface Cylinder is "+area);
    }
}
