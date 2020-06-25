import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class testMap {

    public static void main(String[] args) {

        Map<String,Integer> hashmap = new HashMap<>();

        hashmap.put("Smith", 30);
        hashmap.put("Tom", 32);
        hashmap.put("Jerry", 28);
        hashmap.put("Paul", 5);

        System.out.println("Display entries in Hashmap ");
        System.out.println(hashmap + "\n");

        Map<String,Integer> treeMap = new TreeMap<>(hashmap);

        System.out.println("Display entries in ascending order of key ");
        System.out.println(treeMap);

        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);

        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Tom", 32);
        linkedHashMap.put("Jerry", 28);
        linkedHashMap.put("Paul", 5);

        System.out.println("\nThe age for Lweis is " + linkedHashMap.get("Jerry"));

        System.out.println("Display linkedHashMap entries ");
        System.out.println(linkedHashMap);

    }
}
