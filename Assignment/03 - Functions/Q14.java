package danish;
// Sum of N number Natural Number;;;
import java.util.*;
public class Q14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = in.nextInt();
        System.out.println(sum(n));

    }
        static int sum (int n){
        int add =0;
        int i =0;
        for (i = 0;i<=n;i++){
            add += i;
        }
        return add;
        }
}
