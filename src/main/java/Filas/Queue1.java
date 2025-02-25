package Filas;

import Listas.LinkedList.LinkedList;

public class Queue1<T> {
    private LinkedList<T> list;

    public Queue1() {
        this.list = new LinkedList<>();
    }

    void add(T element){
        this.list.addElementAtEnd(element);
    }
    T peek(){
        if (isEmpty()){
            throw new Error("Queue is empty");
        }
        return this.list.getHead().getValue();
    }
    T remove(){
        if (isEmpty()){
            throw new Error("Queue is empty");
        }
        return this.list.removeAtIndex(0);
    }
    int count(){
        return this.list.getSize();
    }
    boolean isEmpty(){
        return this.list.isEmpty();
    }



}
