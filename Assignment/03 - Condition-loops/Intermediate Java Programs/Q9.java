
//Batting Average;;;
import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Runs");
        double runs = in.nextDouble();
        System.out.println("Enter Matches");
        double match = in.nextDouble();
        System.out.println("Not-Out times");
        double notout = in.nextDouble();
        double time = match-notout;
        double average = runs/time;
        if(average==-1){
            System.out.println("NA");
        }
        System.out.print("Average Batsman "+average);

    }
}
