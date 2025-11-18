//Reverse a List :Write a program to reverse the elements of a given List without using built-in reverse methods. Implement it for both ArrayList and LinkedList.

import java.util.*;
public class ReverseArrayList {
    public static void reverse(ArrayList<Integer> list) {
        int i = 0;
        int j = list.size() - 1;

        while (i < j) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);

            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        reverse(list);

        System.out.println(list);
    }
}

