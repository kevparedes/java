import java.util.Scanner;

public class lottery {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your 3 ticket numbers: ");
        int numb1 = in.nextInt();

        int numb2 = in.nextInt();

        int numb3 = in.nextInt();

        int lottery1 = (int)(Math.random()*100);

        int lottery2 = (int)(Math.random()*100);

        int lottery3 = (int)(Math.random()*100);

        System.out.println("The winning number are: " + lottery1 + " " + lottery2 + " " + lottery3);

        int win = 0;

        if (numb1 == lottery1){
            System.out.println("number " + numb1);
            win = win + 1;
        }else if (numb2 == lottery2){
            System.out.println("number " + numb2);
            win = win + 1;
        }else if (numb3 == lottery3){
            System.out.println("number " + numb3);
            win = win + 1;
        }

        if (win == 3){
            System.out.println("YOU WON THE LOTTERY!");
        }else {
            System.out.println("you did not win...");
        }
    }
}
