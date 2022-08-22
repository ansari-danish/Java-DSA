//Write a program to find Number is Even or Odd;;


package danish;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = in.nextInt();
        int ans = oddeven(num);
        if ( ans == -1 ){
            System.out.println(num+": odd Number");
        }
        else
            System.out.println(ans+": even number");
    }
    static int oddeven(int num){
        int even;
        if ( num%2==0 ){
            even  = num;
            return even;
        }
        else
            return -1;
    }
}
