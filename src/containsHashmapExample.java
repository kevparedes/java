import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class containsHashmapExample {

    static void check(String [] magazine, String [] note){

        List<String> list1 = new ArrayList<String>(Arrays.asList(magazine));

        List<String> list2 =new ArrayList<String>(Arrays.asList(note));

        System.out.println(list1);

        System.out.println(list2);

        if (list1.contains(list2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }

    public static void main(String[] args) {

        String [] magazine = {"two","times","three","is","not","four"};

        String [] note = {"two","times","two","is", "four"};

        check(magazine, note);

    }

}
