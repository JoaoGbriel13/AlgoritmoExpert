package Arvores.BST;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        BinaryTree<Integer> setA = new BinaryTree<>();

        setA.add(52);
        setA.add(17);
        setA.add(67);
        setA.add(11);
        setA.add(33);
        setA.add(55);
        setA.add(83);
        setA.add(58);
        System.out.println(setA.getSize());
        System.out.println(setA.isEmpty());
        List<Integer> numbers = List.of(1,2,3,5,6,8,12,28,99,105);
        setA.addAll(numbers);
        System.out.println(setA.getSize());
        System.out.println(setA.keys());
        System.out.println(setA.contains(58));
        System.out.println(setA.toStringFormat());
        setA.remove(17);
        System.out.println(setA.toStringFormat());
    }
}
