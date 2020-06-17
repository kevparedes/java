import java.util.Scanner;

public class analazingNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of items: ");

        int number = in.nextInt();

        double [] items = new double[number];

        double sum = 0;

        System.out.println("Enter the numbers: ");

        for (int i =0; i < number; i++){
            items [i] = in.nextDouble();
            sum += items[i];
        }

        double average = sum / number;

        int count = 0;

        for (int i = 0; i < number; i++){
            if (items[i] > average){
                count++;
            }
        }

        System.out.println("Average is: " + average);

        System.out.println("The number of elements above the average is: " + count);
    }
}
