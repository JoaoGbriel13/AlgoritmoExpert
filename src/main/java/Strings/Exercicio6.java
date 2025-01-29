package Strings;

import java.util.Arrays;
import java.util.stream.Stream;

public class Exercicio6 {
    public static void main(String[] args) {
        System.out.println(isAnagram2("anagram", "nagaram"));
        System.out.println(isAnagram2("rat", "car"));
    }
    public static boolean isAnagram(String s, String t){
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }

    public static boolean isAnagram2(String s, String t){
        int[] frequency = new int[26];
        for (int i = 0; i < s.length(); i++){
            int index = s.codePointAt(i) - "a".codePointAt(0);
            frequency[index]++;
        }
        for (int j = 0; j < t.length(); j++){
            int index = t.codePointAt(j) - "a".codePointAt(0);
            frequency[index]--;
        }

        for (int val : frequency){
            if (val != 0){
                return false;
            }
        }
        return true;
    }
}

