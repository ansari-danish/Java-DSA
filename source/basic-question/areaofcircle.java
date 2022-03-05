import java.util.Scanner;
public class areaofcircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius value");
        int radius = in.nextInt();
       double pie =3.140;
        double area = pie*radius*radius;
        System.out.println("the area of circle is "+area);
}
}
