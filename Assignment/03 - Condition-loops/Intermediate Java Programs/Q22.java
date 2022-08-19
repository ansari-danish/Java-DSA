//Perfect Number in Java;;
import java.util.*;
public class Q22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int number = in.nextInt();
        int number1 = 0;
        for (int i = 1; i< number; i++) {
            if (number % i == 0) {
               number1+=i;
            }
        }
        if(number1 == number){
            System.out.println("Perfect Number");
        }
        else
            System.out.println("Not a Perfect Number");
    }}
