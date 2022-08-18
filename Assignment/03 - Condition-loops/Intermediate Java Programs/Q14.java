// Find number is Armstrong or Not;;
import java.util.*;
public class Q14{
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int number = in.nextInt();
        int original = number;
        int result = 0;
        int numb = 0;
        while(original!=0){
            numb = original%10;
            result += Math.pow(numb,3);
            original /=10;
        }
        if(result == number){
            System.out.println("Armstrong Number");
        }
        else
            System.out.println("Not Armstrong");
    }
        }