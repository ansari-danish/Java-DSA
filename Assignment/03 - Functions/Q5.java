//Product of Number;;

package danish;
import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = in.nextInt();
        System.out.print("Enter Number: ");
        int number1 = in.nextInt();
        System.out.println(product(number,number1));
    }

    static int product(int number,int number1) {
     return number*number1;
    }
}
