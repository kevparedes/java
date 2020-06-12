import java.util.Scanner;

public class displayTime {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("enter an integer for seconds ");

        int seconds = input.nextInt();

        int min = seconds /60;
        int remainingSec = seconds % 60;

        System.out.println(seconds + " seconds is: " + min +" minutes is: " + remainingSec + " remaining seconds");
    }
}
