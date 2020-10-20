import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("numbers.txt");
            Scanner myReader = new Scanner(myObj);
            
            while (myReader.hasNextLine()){

                int size = myReader.nextInt();
                myReader.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
                
                int[] a = new int[size];

                String[] items = myReader.nextLine().split(" ");
                myReader.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int i = 0; i < size ; i++) {

                    int data = Integer.parseInt(items[i]);
                    a[i] = data;
                    
                }
                System.out.println("This is the size "+ size);
                System.out.print("this is the data ");
                for (int j = 0; j <size ; j++) {
                    System.out.print(a[j] + " ");
                }
            }
            myReader.close();
        }catch (FileNotFoundException e){
            System.out.println("Error occurred");
            e.printStackTrace();
        }
    }
}
