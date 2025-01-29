package Arrays;

import java.util.Arrays;

public class Exercicio7 {
    public static void main(String[] args) {
        int[] numbs = {1,0,2,3,0,4,5,0};
        System.out.println(Arrays.toString(duplicateZeros(numbs)));
    }
    public static int[] duplicateZeros(int[] numbs){
        for(int i = 0; i < numbs.length - 1; i++){
            if (numbs[i] == 0){
                for (int j = numbs.length - 2; j > i; j--){
                    numbs[j + 1] = numbs[j];
                }
                numbs[i + 1] = numbs[i];
                i = i + 1;
            }
        }
        return numbs;
    }
}
