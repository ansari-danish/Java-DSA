import java.util.Scanner;
public class rectangle{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of a rectangle");
        int length = in.nextInt();
        System.out.println("Enter heigth of a rectangle");
        int height = in.nextInt();
        int area = length * height;
        System.out.println("the area of rectangle is "+area);
    }}
