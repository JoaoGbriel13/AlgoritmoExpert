package Ordenacao;

import java.util.Arrays;

public class Exercicio3 {
    public static void main(String[] args) {
        int[] numbs = {2,4,6,15,27,39,58,100,23,52};
        System.out.println(Arrays.toString(insertionSort(numbs)));
    }
    public static int[] insertionSort(int[] numb){
        for (int i = 1; i < numb.length; i++){
            int aux = numb[i];
            int j = i - 1;
            while (j >= 0 && numb[j] > aux){
                numb[j + 1] = numb[j];
                j-= 1;
            }
            numb[j + 1 ]= aux;
        }
        return numb;
    }
}
