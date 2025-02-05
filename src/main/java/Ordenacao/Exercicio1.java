package Ordenacao;

import java.util.Arrays;

public class Exercicio1 {
    public static void main(String[] args) {
        int[] numb = {7, 2, 5, 3, 8, 4, 1, 6};
        int[] othernumb = {55,26,0,2,4,52,105,128,18};
        System.out.println(Arrays.toString(recursiveBubbleSort(numb, 0, 1)));
        System.out.println(Arrays.toString(recursiveBubbleSort(othernumb, 0, 1)));
    }

    public static int[] bubbleSort(int[] numb){
        for (int i = 0; i < numb.length; i++){
            for (int j = i + 1; j < numb.length; j++){
                if (numb[i] > numb[j]){
                    int aux = numb[j];
                    numb[j] = numb[i];
                    numb[i] = aux;
                }
            }
        }
        return numb;
    }
    public static int[] recursiveBubbleSort(int[] numb, int i, int j){
        if (j < numb.length){
            if (numb[i] > numb[j]){
                int aux = numb[i];
                numb[i] = numb[j];
                numb[j] = aux;
            }
            return recursiveBubbleSort(numb, i , j + 1);
        } else if (i < numb.length - 1) {
            return recursiveBubbleSort(numb, i + 1, i + 1);
        }else {
            return numb;
        }

    }
}
