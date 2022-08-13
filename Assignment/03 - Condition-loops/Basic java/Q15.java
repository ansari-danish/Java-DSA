
//volume of Prism;;;
import java.util.*;
public class Q15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the length of Prism: ");
       double length = in.nextDouble();
        System.out.print("enter the length of Width: ");
        double width = in.nextDouble();
        System.out.print("enter the length of height: ");
        double height = in.nextDouble();
        double volume = length*width*height;
        System.out.println("Volume of a Prism is: "+volume);
           }
}
