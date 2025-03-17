package Filas;

import Listas.LinkedList.LinkedList;

public class Queue1<T> {
    private LinkedList<T> list;

    public Queue1() {
        this.list = new LinkedList<>();
    }

    public void add(T element){
        this.list.addElementAtEnd(element);
    }
    public T peek(){
        if (isEmpty()){
            throw new Error("Queue is empty");
        }
        return this.list.getHead().getValue();
    }
    public T remove(){
        if (isEmpty()){
            throw new Error("Queue is empty");
        }
        return this.list.removeAtIndex(0);
    }
    public int count(){
        return this.list.getSize();
    }
    public boolean isEmpty(){
        return this.list.isEmpty();
    }



}
