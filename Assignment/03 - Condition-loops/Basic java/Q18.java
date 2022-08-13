//Volume of Pyramid;;;
import java.util.*;

public class Q18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a length ");
        double length = in.nextDouble();
        System.out.print("Enter a width ");
        double width = in.nextDouble();
        System.out.print("Enter a Height");
        double height = in.nextDouble();
        double volume = length*width*height/3;
        System.out.print("Volume of a pyramid is :"+volume);
    }
}
