
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter height");
        double height = in.nextDouble();
        System.out.println("Enter base");
        double base = in.nextDouble();
        double area = height*base/2;
        System.out.println("Area of Triangle is: "+area);
    }
}
