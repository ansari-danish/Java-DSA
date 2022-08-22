/// Write a funtions to check number is palindrome or not ;;;
import java.util.*;
public class Q10 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        boolean ans = palindrome(num);
        if ( ans == true )
            System.out.println(num+" Palindrome");
        else
            System.out.println(num+" Not Palindrome");
    }
    static boolean  palindrome(int num ){
        int rev =0;
        int org = num;
        int sum = 0;
        while(num >0){
            rev = rev*10+num%10;
            num /=10;
        }
        if ( rev == org )
        return true;
        else
            return false;

    }
}