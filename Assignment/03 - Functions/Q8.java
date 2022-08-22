//Take a input Marks and Print the Grades;;;
package danish;
    import java.util.*;
    public class Q8 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter Marks ");
            int marks = in.nextInt();
            grade(marks);

        }
        static void grade (int marks){
            if ( marks>90 && marks<101 )
                System.out.println("AA");
            if ( marks>80 && marks<90 )
                System.out.println("AB");
            if ( marks>70 && marks<80 )
                System.out.println("BB");
            if ( marks>60 && marks<70 )
                System.out.println("BC");
            if ( marks>50 && marks<60 )
                System.out.println("CD");
            if ( marks>40 && marks<50 )
                System.out.println("DD");
            if ( marks<40 )
                System.out.println("FAIL");

        }
        }