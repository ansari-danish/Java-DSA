//Depriation of Amount;;;
import java.util.*;
public class Q8{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value");
        double value = in.nextDouble();
        System.out.println("Enter a rate");
        double rate = in.nextDouble();
        System.out.println("Enter a time");
        double time = in.nextDouble();
        double total = 0;
          total = value *Math.pow(1-rate/100,time);
        System.out.println(total);
       }
}