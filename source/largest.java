import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i ;
        System.out.println("enter number ");
        i = in.nextInt();
        int j;
        System.out.println("enter number");
        j = in.nextInt();
        if(i<j)
            System.out.println("this is greatest number "+ j);
        else if (i==j)
            System.out.println("both are same");
        else
            System.out.println("this is greatest number "+ i);
    }
}
