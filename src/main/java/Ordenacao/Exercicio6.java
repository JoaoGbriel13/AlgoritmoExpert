package Ordenacao;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class Exercicio6 {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String filePath = "C:\\Users\\joaog\\IdeaProjects\\AlgoritmoExpert\\src\\main\\java\\Ordenacao\\Utils\\input.json";
        String[] words = mapper.readValue(new File(filePath), String[].class);
        insertionSort(words);
        bubbleSort(words);

        var start = Instant.now();
        quickSort(words, 0, words.length - 1);
        System.out.printf("QuickSort: %dms", Duration.between(start, Instant.now()).toMillis());
    }
    public static void insertionSort(String[] words){
        var start = Instant.now();
        String[] insertionCopy = Arrays.copyOf(words, words.length);
        for (int i = 1; i < insertionCopy.length; i++){
            var element = insertionCopy[i];
            int j = i - 1;
            while (j >= 0 && insertionCopy[j].compareTo(element) > 0){
                insertionCopy[j + 1] = insertionCopy[j];
                j-= 1;
            }
            insertionCopy[j + 1 ] = element;
        }
        System.out.printf("Insertion Sort: %dms\n", Duration.between(start, Instant.now()).toMillis());
    }
    public static void bubbleSort(String[] words){
        var start = Instant.now();
        String[] bubbleCopy = Arrays.copyOf(words, words.length);
        for(int i = 0; i < bubbleCopy.length; i++){
            for (int j = i + 1; j < bubbleCopy.length; j++){
                if (bubbleCopy[j].compareTo(bubbleCopy[i]) < 0){
                    var aux = bubbleCopy[j];
                    bubbleCopy[j] = bubbleCopy[i];
                    bubbleCopy[i] = aux;
                }
            }
        }
        System.out.printf("Bubble Sort: %dms\n", Duration.between(start, Instant.now()).toMillis());
    }
    public static void quickSort(String[] words, int left, int right){
        if (left < right){
            var partition = partition(words, left, right);
            quickSort(words, left, partition - 1);
            quickSort(words, partition + 1, right);
        }
    }
    public static int partition(String[] words, int left, int right){
        var pivot = words[right];
        int i = left;
        for (int j = i; j < right; j++){
            if (words[j].compareTo(pivot) <= 0){
                swap(words,i, j);
                i+= 1;
            }
        }
        swap(words,i, right);
        return i;
    }
    public static void swap(String[] words, int i, int j ){
        var aux = words[j];
        words[j] = words[i];
        words[i] = aux;
    }
}
