import java.util.Scanner;

public class tempConvertorFtoC {
    public static void main(String[]args)
    {
        Scanner  input = new Scanner(System.in);
        System.out.println("Enter the F temp: ");

        double ftemp = input.nextDouble();

        double ctemp = (5.0 / 9) * (ftemp - 32);

        System.out.println("the temp in C is: " + ctemp);
    }
}
