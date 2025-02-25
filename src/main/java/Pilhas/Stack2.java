package Pilhas;

import Listas.LinkedList.LinkedList;
import Listas.LinkedList.Node;

public class Stack2<T> {
    private LinkedList<T> list;

    public Stack2() {
        this.list = new LinkedList<>();
    }
    public void push(T item){
        this.list.addElementAtEnd(item);
    }
    public void pop(){
        if (isEmpty()){
            throw new Error("Stack is empty");
        }
        this.list.removeAtIndex(this.list.getSize() - 1);
    }
    public Node<T> peek(){
        return this.list.getNodeAtIndex(this.list.getSize() - 1);
    }
    public int size(){
        return this.list.getSize();
    }
    public void getAll(){
        this.list.getLinkedList();
    }
    public boolean isEmpty(){
        return this.list.getSize() == 0;
    }
    public void clear(){
        this.list.clearList();
    }
}
