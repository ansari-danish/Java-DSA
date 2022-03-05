import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number");
        int num = in.nextInt();
       boolean result= palin(num);
      if(result == true)
          System.out.println("this is palindrome");
      else
          System.out.println("this is not palindrome");
    }
    static boolean palin(int num){
        if(num == 0)
        return true;
        if(num<0)
          return false;
        int t = num;
        int rev = 0;
        while (t>0){
            int d = t%10;
            rev = 10*rev +d;
            t = t/ 10;
            if(rev == num)
                return true;
                }
            return false;
    }
}
