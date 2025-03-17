package Dicionarios.TwoSum;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        Integer[] numbers = {3,3};
        HashMap<Integer, Integer> twoSum = new HashMap<>();
        int[] ans = new int[2];
        var target = 6;
        for (int i = 0; i < numbers.length; i++) {
            var remaining = Math.abs(target - numbers[i]);
            if (twoSum.containsKey(remaining)){
                ans[0] = twoSum.get(remaining);
                ans[1] = i;
            }
            twoSum.put(numbers[i], i);
        }
        System.out.println(Arrays.toString(ans));
    }
}