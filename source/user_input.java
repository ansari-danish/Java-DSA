import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("input some number");
        int a = input.nextInt() ;
        System.out.println("your number is "+ a +" this");
    }
}
