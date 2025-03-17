package Dicionarios;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {0,1,2,2,4,4,1};
        HashMap<Integer, Integer> hashNumbers = new HashMap<>();
        int maxApp = 0;
        for (int n : numbers){
            if (n % 2 == 0){
                hashNumbers.put(n, hashNumbers.getOrDefault(n, 0) + 1);
                maxApp = Math.max(maxApp, hashNumbers.get(n));
            }
        }
        int lowestKey = 100000000;
        for (Map.Entry<Integer, Integer> v : hashNumbers.entrySet()){
            if (v.getValue() == maxApp) {
                if (v.getKey() < lowestKey){
                    lowestKey = v.getKey();
                }
            }
        }
        System.out.println(lowestKey);
    }
}
