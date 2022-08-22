package danish;

import java.util.*;
//Area of Circle;;
public class Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        int rad = in.nextInt();
        System.out.println("Area of circle "+area(rad));
    }
    static int area(int rad) {
    int form = (int) (Math.PI*(rad*rad));
    return form;
    }
}
