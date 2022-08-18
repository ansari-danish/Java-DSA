//Reverse a String;;
import java.util.*;
public class Q16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Word");
        String word = in.next();
        char ch ;
        String last ="";
        for (int i = 0;i<word.length();i++){
        ch = word.charAt(i);
        last = ch+last;
        }
        System.out.println(last);
    }
}
