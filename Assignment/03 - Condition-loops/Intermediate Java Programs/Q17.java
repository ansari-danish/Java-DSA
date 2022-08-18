// Palindrome Number;;
import java.util.*;
public class Q17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = in.nextInt();
        int num = number;
        int check = 0;
        int check1 = 0;
        while(number!=0){
            check=number%10;
            check1 = check1*10+check;
            number /=10;
        }
        if(check1 == num)
        System.out.println("Palindrome Number");
    else
            System.out.println("not Palindrome");
    }
}
