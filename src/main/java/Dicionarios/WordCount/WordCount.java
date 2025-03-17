package Dicionarios.WordCount;

import java.text.Normalizer;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {
    public static void main(String[] args) {
        String text = "O vento sussurra " +
                "sons entre as árvores, " +
                "sons que fazem animais correrem. " +
                "A floresta e a natureza vibram com segredos e sons.";
        String[] words = text.replace(",", "").split(" ");
        HashMap<String, Integer> wordMap = new HashMap<>();
        for (String word: words){
            String wordFormatted = removerAcentos(word);
            wordMap.put(wordFormatted, wordMap.getOrDefault(wordFormatted, 0) + 1);
        }
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordMap.entrySet());
        sortedList.sort((a, b) -> {
            int freqValue = b.getValue().compareTo(a.getValue());
            if (freqValue != 0 ){
                return freqValue;
            }
            return a.getKey().compareTo(b.getKey());
        });
        for (Map.Entry<String, Integer> entry : sortedList){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static String removerAcentos(String texto) {
        String normalized = Normalizer.normalize(texto, Normalizer.Form.NFD).toLowerCase();
        return normalized.replaceAll("[^\\p{L}\\p{N}\\s]", "");
    }
}
