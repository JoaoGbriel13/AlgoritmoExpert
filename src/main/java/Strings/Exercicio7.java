package Strings;

import java.util.Arrays;

public class Exercicio7 {
    public static void main(String[] args) {
        String[] test = new String[2];
        test[0] = "racism";
        test[1] = "rac";
        System.out.println(findLongestSufix(test));
    }
    public static String findLongestSufix(String[] word){
        Arrays.sort(word);
        if (word.length == 1){
            return word[0];
        }
        char[] first = word[0].toCharArray();
        char[] last = word[word.length - 1].toCharArray();
        int index = 0;
        StringBuilder prefixBuilder = new StringBuilder();
        while (index < Math.min(first.length, last.length) && first[index] == last[index]){
            prefixBuilder.append(first[index]);
            index++;
        }
        return !prefixBuilder.toString().isEmpty() ? prefixBuilder.toString() : "";
        }

    }
