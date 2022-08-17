
//User input till user want and Find Average of a number;;;

import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      int num;int sum = 1;
      int n =-1;
        do {
            System.out.print("Enter number | Press -1 to exit");
            num = in.nextInt();
            sum += num;
            n++;
        }while(num > 0);
        System.out.println("Addition of all number is "+sum);
        System.out.println("Average of number is "+sum/n);
    }
}
