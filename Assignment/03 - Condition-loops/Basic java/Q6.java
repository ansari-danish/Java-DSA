
// Take input and print the Area of Rhombus;;;;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a Diagonal");
        double diagonal = in.nextDouble();
        System.out.println("enter a another Diagonal");
        double diagonal1 = in.nextDouble();
        double area = diagonal1*diagonal/2;
        System.out.println("Area of Rhombus is: "+area);
    }
}
