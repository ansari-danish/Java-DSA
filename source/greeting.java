//Take name as input and print a greeting message for that particular name.
import java.util.Scanner;
public class greeting {
    public static void main(String[] args) {
     Scanner in = new Scanner (System.in);
        String num ;
        System.out.println( "enter your name");
    num = in.nextLine();
        System.out.println("Assalamu alaikum "+ num);
    }
}
