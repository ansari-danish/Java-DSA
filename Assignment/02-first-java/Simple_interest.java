
//Program for Simple Interest;;;;

import java.util.Scanner;

public class Simple_interest   {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount");
        int amount = in.nextInt();
        System.out.println("No of time");
        int time = in.nextInt();
        System.out.println("Rate of Interest");
        int rate= in.nextInt();
        int total = amount*time*rate/100;
        System.out.println("Your interest is "+ total);
        System.out.println("total amount to pay is "+ (total+amount));
    }
}
