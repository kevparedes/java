import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class countKeyWords {

    public static int countKeyWords (File file) throws FileNotFoundException {

        String [] keywords = { "Hello", "move", " fast", "due", "slow", "people", "Sale", "design"};

        Set<String> keywordSet = new HashSet<>(Arrays.asList(keywords));

        int count = 0;

       Scanner in = new Scanner(file);

       while (in.hasNext()){

           String word = in.next();

           if (keywordSet.contains(word)){
               count++;
           }
       }

        return count;
    }

    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Java source file: ");

        String filename = in.nextLine();

        File file = new File(filename);

        if (file.exists()){
            System.out.println("The number of key words in " + filename + " is " + countKeyWords(file));
        }
        else
            System.out.println("File "+ filename+ " Not found");
    }
}
