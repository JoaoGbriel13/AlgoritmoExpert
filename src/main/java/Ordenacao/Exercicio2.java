package Ordenacao;

import java.util.Arrays;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] numbs = {2,4,6,15,27,39,58,100,23,52};
        System.out.println(Arrays.toString(selectionSort(numbs)));
    }
    public static int[] selectionSort(int[] numb){
        for (int i = 0; i < numb.length - 1; i++){
            int lowest = i;
            for (int j = i + 1; j < numb.length; j++){
                if (numb[j] < numb[lowest]){
                    lowest = j;
                }
            }
            if (lowest != i){
                int aux = numb[i];
                numb[i] = numb[lowest];
                numb[lowest] = aux;
            }
        }
        return numb;
    }
}
