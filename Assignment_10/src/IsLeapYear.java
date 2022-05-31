public class IsLeapYear {
    static void isLeap(int year) {
        if ((year % 4) == 0) {
            if(year % 100 == 0 && year % 400==0) {
                System.out.println("leap year");

                }
            else if(year % 100 != 0) {
                System.out.println("leap year");
            }
            else
            {
                System.out.println("not leap year");
            }
        }
        else
        {
            System.out.println("not leap year");
        }
    }
    public static void main(String[] args) {
        isLeap(2008);
    }
}
