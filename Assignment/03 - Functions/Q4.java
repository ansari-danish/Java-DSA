//Write a fuction to print the sum of two numbers;;
package danish;
import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int number1 = in.nextInt();
        System.out.print("Enter Number 2: ");
        int number2 = in.nextInt();
        System.out.println("Sum: "+sum(number2,number1));
    }
    static int sum(int n1,int n2){
        return n1+n2;
    }

}
