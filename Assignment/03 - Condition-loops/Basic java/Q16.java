//Volume of a Cylinder;;;
import java.util.*;
public class Q16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Radius ");
    double radius = in.nextDouble();
        System.out.print("enter a Height");
        double height = in.nextDouble();
        double volume = Math.PI*radius*radius*height;
        System.out.print("Volume of cylinder is :"+volume);
    }
}
