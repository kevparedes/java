import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a msg1: ");

        String msg1 = in.nextLine();

        System.out.println("Enter a msg2: ");

        String msg2 = in.nextLine();

        System.out.println( msg1 == msg2);

        System.out.println( msg1.equals(msg2));

        System.out.println(msg1.compareTo(msg2));

        System.out.println(msg1.length());

        System.out.println(msg1.contains(msg2));

        System.out.println(msg1.concat(msg2));
    }
}
