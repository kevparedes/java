import java.util.Scanner;

public class computeFactorial {

    public static long factorial (int number){
        if (number == 0){
            return 1;
        }else
        return number * factorial(number - 1);
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a non-negative integer ");

        int number = in.nextInt();

        System.out.println("Factorial of " + number + " is " + factorial(number));
    }
}
