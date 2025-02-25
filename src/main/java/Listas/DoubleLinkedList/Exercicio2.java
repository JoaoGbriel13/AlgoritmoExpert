package Listas.DoubleLinkedList;

import java.util.Arrays;

public class Exercicio2 {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> ddl = new DoubleLinkedList<>();
        ddl.insertAtTail(5);
        ddl.insertAtTail(10);
        ddl.insertAtTail(8);
        ddl.insertAtHead(12);
        System.out.println(Arrays.toString(ddl.toArray()));
        ddl.revertList();
        System.out.println(Arrays.toString(ddl.toArray()));
    }
}
