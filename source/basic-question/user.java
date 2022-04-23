import java.util.Scanner;
public class user{
public static void main(String[]args){
     Scanner in = new Scanner (System.in);
      int num ;
      int total = 0;
      int i =1 ;
      int j;
    System.out.println("how many times u want to add");
     j = in.nextInt();
      while(i<=j)
      {
          System.out.println("enter number");
          num = in.nextInt();
          total += num;
          i++;
          if(num<=0)
          {
              System.out.println(total);
              i=j;
      }}
    System.out.println(total);
}
        }