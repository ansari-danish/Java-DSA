//Electricity bill Programm;;;;
import java.util.*;
public class Q2 {
public static void main(String[]args){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a unit");
        int unit= in.nextInt();
        int amount=0;
        if(unit<=100){
            amount = unit*10;
        }
        if(unit>100 && unit<=200){
            amount = 100*10+(unit-100)*15;
        }
        if(unit>200 && unit<=300){
            amount = 100*10+100*15+(unit-200)*20;
            }
        if(unit>300){
            amount = 100*10+100*15+100*20+(unit-300)*25;
        }
    System.out.println(amount);
}
        }