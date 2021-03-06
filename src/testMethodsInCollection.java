import java.util.HashSet;
import java.util.Set;

public class testMethodsInCollection {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();

        set1.add("London");
        set1.add("Paris");
        set1.add("New York");
        set1.add("San Francisco");
        set1.add("Beijin");

        System.out.println("set1 is: " + set1);

        System.out.println(set1.size() + " elements in set1");

        //Deleting a string from set1

        set1.remove("London");
        System.out.println("\nset1 is " + set1);
        System.out.println(set1.size() + " elements in set1");

        //Creating another set
        Set<String> set2 = new HashSet<>();

        set2.add("London");
        set2.add("Shanghai");
        set2.add("Paris");

        System.out.println("\nset2 is: " + set2);
        System.out.println(set2.size()  + " elements in set2");

        //Comparing

        System.out.println("\nIs Taipei in set2? " +set2.contains("Taipei"));

        //Adds all elements from another set
        set1.addAll(set2);
        System.out.println("After adding set1 and set2 the set1 is " + set1);

        //Remove all from a set
        set1.removeAll(set2);
        System.out.println("After removing set2 from set1 the set1 is " + set1);

        set1.retainAll(set2);
        System.out.println("After removing common elements in set2 from set1, set1 is " +set1);
    }
}
