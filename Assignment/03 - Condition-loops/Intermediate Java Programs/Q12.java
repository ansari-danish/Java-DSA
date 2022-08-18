//Calcute Average Number;;;
import java.util.*;
public class Q12 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = in.nextInt();
        int []arr = new int[n];
        int total = 0;
        for (int i = 0;i<n;i++){
            System.out.println("Subject Marks");
            arr[i]=in.nextInt();
            total+=arr[i];
        }
     int last = total/n;
        System.out.println(last     );
    }

}
