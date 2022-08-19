//Check Year is Leap or Not;;
import java.util.*;
public class Q23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Year");
        int year = in.nextInt();
        if(year % 100!=0&&year %4== 0||year %400==0){
            System.out.println(year +" is a leap year");
        }
        else
            System.out.println(year+" is not leap year");
    }
}
