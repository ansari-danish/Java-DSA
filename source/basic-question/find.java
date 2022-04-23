package Solution;
    public class find {
        public static void main(String[] args) {
            int year =2020;
            if ((year % 400 ==0)||((year % 100 != 0) && (year % 4 == 0)))
                System.out.println("Leap-year");
            else
                System.out.println("non-leap");
    }
    }