//Sum of N number;;;
import java.util.*;

public class Q13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n ;
        int  num=0;
        do {
            System.out.println("enter a number | Press 0 to exit");
            n = in.nextInt();
            num += n;
        }while(n!=0);
        System.out.println(num);
    }
}
