package Sets;

import java.util.HashSet;
import java.util.Set;

public class Exercicio1 {
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);
        setB.add(8);
        Set<Integer> setC = new HashSet<>(setA);
        setC.retainAll(setB);
        System.out.println(setC);
    }
}
