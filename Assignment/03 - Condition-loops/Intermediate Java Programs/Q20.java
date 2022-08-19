//LCM of a Number;;;
import java.util.*;
public class Q20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = in.nextInt();
        System.out.println("Enter another number");
        int num2 = in.nextInt();
        int max = Math.max(num1,num2);
        for (int i = 2;i<=max;i++){
            if (num1%i==0 && num2%i==0){
                System.out.println(i);
            }
        }
    }
}
