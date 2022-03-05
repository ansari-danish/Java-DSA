import java.util.Scanner;
public class parallelo {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter length of a paralelo");
            int length = in.nextInt();
            System.out.println("Enter heigth of a paralelo");
            int height = in.nextInt();
            int area = length * height/2;
            System.out.println("the area of triangle is "+area);
        }}

