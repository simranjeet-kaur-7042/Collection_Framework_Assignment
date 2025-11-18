//Merge two maps such that if a key exists in both, sum their values.

package Map_Interface;
import java.util.*;
public class MergeMaps {
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        System.out.println("Map1: " + map1);
        System.out.println("Map2: " + map2);
        Map<String, Integer> merged = new HashMap<>(map1);

        for (String key : map2.keySet()) {
            int sum = merged.getOrDefault(key, 0) + map2.get(key);
            merged.put(key, sum);
        }

        System.out.println("Merged Map: " + merged);
    }
}

