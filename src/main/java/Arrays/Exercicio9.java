package Arrays;

import java.util.*;
import java.util.stream.Collectors;

public class Exercicio9 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {1,2,2,3,3,4};
        System.out.println(checkDupes(nums2));
        System.out.println(checkDupes(nums1));
    }
    public static boolean checkDupes(int[] numbs){
        Set<Integer> auxSet = Arrays.stream(numbs).boxed().collect(Collectors.toSet());
        return auxSet.size() != numbs.length;
    }
}
