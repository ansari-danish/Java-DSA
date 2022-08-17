// Right a Program to find discount value;;;

import java.util.*;
public class Q4{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Product value");
        int product = in.nextInt();
        System.out.println("Enter Discount %");
        int discount = in.nextInt();
        int total = product*discount/100;
        System.out.println(product-total+"Rs");

    }
}