import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a year ");

        int year = in.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 !=0) || (year % 400 == 0);

        if (isLeapYear){
            System.out.println("this year is a leap year");
        }
        else
            System.out.println("this year is not a leap year");
    }
}
