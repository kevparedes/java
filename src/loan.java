import java.util.Scanner;

public class loan {
    //psvm shortcut
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the annual interest rate in percentage: ");

        double rate = input.nextDouble();

        double annualRate = rate / 1200;

        System.out.println("Enter number of years of the loan: ");

        int numbYears = input.nextInt();

        System.out.println("Enter the loan ammount: ");

        double loan = input.nextDouble();

        double monthlyPayment = loan * rate / (1 - 1 / Math.pow(1 + annualRate, numbYears * 12));

        double totalPayment = monthlyPayment * numbYears * 12;

        System.out.println("monthly payment is $: " + (int)(monthlyPayment * 100) / 100.0);

        System.out.println("total payment is $: " +  (int)(totalPayment * 100) / 100.0);
    }
}
