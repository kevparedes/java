import java.util.ArrayList;

public class arrayListExample {
    public static void main(String[] args) {
        int size = 5;

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i <size ; i++) {

            arr.add(i);
        }

        System.out.println(arr);
    }
}
