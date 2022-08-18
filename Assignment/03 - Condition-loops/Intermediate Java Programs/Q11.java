//Compound Interest Formulal;;;
//FormuQla is not accurate;;
import java.util.*;
public class Q11 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a amount ");
        double amount = in.nextDouble();
        System.out.println("Interest Rate ");
        double rate = in.nextDouble();
        System.out.println("No of Interest applied ");
        double interest = in.nextDouble();
        System.out.println("No of time elapse ");
        double time = in.nextDouble();
        double total = amount*Math.pow((1+rate/100),time);
        System.out.println(total);
    }
}
