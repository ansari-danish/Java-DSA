// Write a program to identify vowel and consonant;;
// vowel = a,e,i,o,u;
//consonant = except vowel ,all of about
import java.util.*;
public class Q21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Alphabet");
        int n = 0;
      char c =in.next().charAt(0);
       if(c =='a'||c =='e'||c =='i'||c == 'o'||c=='u'){
           System.out.println(c+" is a vowel");
       }
        if(c =='A'||c =='E'||c =='I'||c == 'O'||c=='U'){
            System.out.println(c+" is a vowel");
        }
       else
           System.out.println("its a consonent");

    }
}
