import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class arrayWithPairsDifference {

    public static void main(String[] args) {

        Set<Integer> set = new LinkedHashSet<>();

        set.add(1);
        set.add(7);
        set.add(5);
        set.add(9);
        set.add(2);
        set.add(12);
        set.add(3);

        System.out.println(set);

        for (Object element : set){
            System.out.print(element + " ");
        }

        System.out.println();

        TreeSet<Integer> treeSet = new TreeSet<>(set);
        System.out.println("Sorted collection of integers " + treeSet);

        for (Object number : treeSet){
            System.out.print(number + " ");
        }

    }
}
