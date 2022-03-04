
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          double amount ;
        System.out.print("enter amount");
       amount = in.nextDouble();
       double time;

        System.out.println("No. of time");
        time = in.nextDouble();
        Double rate;
        System.out.println("no of interest ");
        rate = in.nextDouble();
        double simpleInterest =  (amount*rate*time)/100;
        System.out.println("your interst is "+ simpleInterest);
    }
}
