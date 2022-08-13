//Fibonacci Series ;;;
import java.util.*;
public class Q21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("till when Fibonacci u wnat");
        double series = in.nextDouble();
        int first = 0;
        int second =1;
        System.out.print(0);
        for (int i = 0;i<=series;i++){
            int third = first + second;
            first = second;
            second = third ;
            System.out.print(" "+first);
        }
    }
}
