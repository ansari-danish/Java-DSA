package danish;
// Write a Function to print prime or not number;
import java.util.*;
public class Q13 {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.print("Enter number: ");
     int num = in.nextInt();
        System.out.println(prime(num));
    }
    static boolean prime(int num) {
        int c = 2;
        boolean ans=true;
        for (c = 2; c < num; c++) {
            if ( num % c == 0 ) {
                ans = false;
                break;
            }
            ans = true;
        }return ans;
    }
}
