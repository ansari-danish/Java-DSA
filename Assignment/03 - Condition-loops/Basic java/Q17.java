//volume of a Sphere;;;
import java.util.*;
public class Q17 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter a radius");
        double radius = in.nextDouble();
        double volume = 4*Math.PI*(radius*radius*radius)/3;
        System.out.print("Volume of a Sphere is: "+volume);
    }

}
