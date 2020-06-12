import java.util.Scanner;

public class computeChange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter an amount: ");

        double amount = in.nextDouble();

        int reaminingAmount = (int)(amount * 100);

        int numberDollars = reaminingAmount / 100;

        reaminingAmount = reaminingAmount % 100;

        int numberQuaters = reaminingAmount / 25;

        reaminingAmount = reaminingAmount % 25;

        int numberDimes = reaminingAmount / 10;

        reaminingAmount = reaminingAmount % 10;

        int numberNickles = reaminingAmount / 5;

        reaminingAmount = reaminingAmount % 5;

        int numberPennies = reaminingAmount;

        System.out.println("Your amount " + amount + " is ");
        System.out.println(" " + numberDollars + " dollars");
        System.out.println(" " + numberQuaters + " quarters");
        System.out.println(" " + numberDimes + " dimes");
        System.out.println(" " + numberNickles + " nickles");
        System.out.println(" " + numberPennies + " pennies");
    }
}
