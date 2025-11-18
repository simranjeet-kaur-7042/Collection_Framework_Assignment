//Remove duplicate elements from a list while maintaining the original order of elements.

import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);
        List<Integer> result = new ArrayList<>();

        Set<Integer> seen = new HashSet<>();

        for (int n : list) {
            if (!seen.contains(n)) {
                seen.add(n);
                result.add(n);
            }
        }

        System.out.println(result);
    }
}

