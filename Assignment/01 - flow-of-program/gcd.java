//Take two number as a input and find its GCD & LCM;;;;;;
import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        int gcd =0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int num1 = in.nextInt();
        System.out.println("enter a number");
        int num2 = in.nextInt();

        for (int i = 1;i<=num1 &&i<=num2;i++){
            if(num1%i==0 && num2%i==0){
               gcd = i;
            }
        }
        System.out.println(gcd);
        int lcm = (num1*num2)/gcd;
        System.out.println("your lcm is "+lcm);
    }
}
