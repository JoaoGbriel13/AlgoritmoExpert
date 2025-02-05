package Recursividade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicio4 {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "juice", "cranberry");
        String[] reversed = new String[fruits.size()];
        System.out.println(reverseList(fruits, fruits.size() - 1, 0, reversed));
        List<String> result = reverseList2(fruits);
        System.out.println(result);
    }
    public static List<String> reverseList(List<String> base, int n, int o, String[] reversed){
        if (n >= 0 && o < reversed.length){
            reversed[o] = base.get(n);
            return reverseList(base, n - 1, o + 1, reversed);
        }
        return List.of(reversed);
    }

    public static <T> List<T> reverseList2(List<T> base){
        if (base.size() <= 1){
            return new ArrayList<>(base);
        }

        T head = base.getFirst();
        List<T> tail = base.subList(1, base.size());
        List<T> newList = reverseList2(tail);
        newList.add(head);
        return newList;
    }
}
