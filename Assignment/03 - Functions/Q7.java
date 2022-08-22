// Find Number Prime or Not;;
package danish;
import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = in.nextInt();
        int ans = prime(num);
        if ( ans==-1 ){
            System.out.println("Not Prime");
        }
        else
            System.out.println("Prime Number");
    }
    static int prime(int num){
        int c = 2;
        while(c>=num/2){
            if ( num%c==0 ){
                return 1;
            }
            c++;
        }
        return -1;
    }
}
