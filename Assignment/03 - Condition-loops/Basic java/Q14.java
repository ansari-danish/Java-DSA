
//Volume of a Cone ;;;
import java.util.*;
public class Q14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a radius ");
        double radius = in.nextDouble();
        System.out.print("Enter a height ");
        double height = in.nextDouble();
        double cone = Math.PI*(radius*radius)*(height/3);
        System.out.println("Volume of a cone is: "+cone);

    }
}
