import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter a number ");

        int numb = in.nextInt();

        if (numb % 2 == 0) {
            System.out.println("Your number was even");
        } else {
            System.out.println("Your number was odd");
        }
    }
}
