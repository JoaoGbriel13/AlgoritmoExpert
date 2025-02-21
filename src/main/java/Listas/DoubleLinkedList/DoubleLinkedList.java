package Listas.DoubleLinkedList;

import java.util.ArrayList;
import java.util.List;

public class DoubleLinkedList <T>{
    private int size;
    private Node<T> head;
    private Node<T> tail;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public void insertAtTail(T value){
        Node<T> node = new Node<>(value);
        if (isEmpty()){
            this.head = node;
            this.tail = node;
            this.size++;
            return;
        }
        node.setPrevious(this.tail);
        this.tail.setNext(node);
        this.tail = node;
        this.size++;
    }

    public void insertAtHead(T value){
        Node<T> node = new Node<>(value);
        if (isEmpty()){
            this.head = node;
            this.tail = node;
            this.size++;
            return;
        }
        node.setNext(this.head);
        this.head.setPrevious(node);
        this.head = node;
        this.size++;
    }

    public T[] toArray(){
        var current = this.head;
        List<T> list = new ArrayList<>();

        while (current != null){
            list.add(current.getValue());
            current = current.getNext();
        }
        return (T[]) list.toArray();
    }
    public void revertList() {
        Node<T> current = this.head;
        Node<T> temp = null;

        while (current != null) {
            temp = current.getPrevious();
            current.setPrevious(current.getNext());
            current.setNext(temp);
            current = current.getPrevious();
        }

        if (temp != null) {
            this.tail = this.head;
            this.head = temp.getPrevious();
        }
    }


    public boolean isEmpty(){
        return this.head == null;
    }

    public void clear(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
}
