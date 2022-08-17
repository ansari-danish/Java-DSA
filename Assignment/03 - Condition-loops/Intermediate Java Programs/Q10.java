//CGPA of Students
import java.util.*;
public class Q10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0;
        double[] arr = new double[6];
        for (int i = 1; i < 6; i++) {
            System.out.print("Subject " + i + " ");
            arr[i] = in.nextInt();
            total += arr[i];
        }
        System.out.println(total);
        System.out.println("Your CGPA is " + total / 5 / 10);
    }}