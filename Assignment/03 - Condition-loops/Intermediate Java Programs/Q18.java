//Future Investment Program;;;
import java.util.*;
public class Q18 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Present Amount");
        double present = in.nextDouble();
        System.out.println("Enter Interest rate");
        double interest = in.nextDouble();
        System.out.println("Number of time Period");
        double time = in.nextDouble();
        double fv = present*(Math.pow(1+interest/100,time));
        System.out.println(fv);

    }
}
