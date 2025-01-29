package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio1 {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        numbers[0] = 1;
        numbers[1] = 1;
        numbers[2] = 0;
        numbers[3] = 1;
        numbers[4] = 1;
        numbers[5] = 1;
        System.out.println(countSequence(numbers));
    }

    public static int countSequence(int[] numbers){
        int actualSequence = 0;
        int biggestSequence = 0;
        for (int number : numbers) {
            if (number == 1) {
                actualSequence++;
            } else {
                actualSequence = 0;
            }
            biggestSequence = Math.max(actualSequence, biggestSequence);
        }
        return biggestSequence;
    }
}
