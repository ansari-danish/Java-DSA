//Factorial of number;;;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        int fact = 1;
        for (int i = 1;i<=num;i++){
fact = fact * i;
         }
        System.out.println(fact);
        }
    }

