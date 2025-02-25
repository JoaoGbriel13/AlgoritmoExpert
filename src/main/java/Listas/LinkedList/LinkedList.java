package Listas.LinkedList;

public class LinkedList<T> {
    private Node<T> head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public Node<T> getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    public void addElementAtEnd(T node){
        Node<T> element = new Node<>(node);
        if (isEmpty()){
            this.head = element;
            this.size++;
            return;
        }
        var current = this.head;
        while (current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(element);
        this.size++;
    }

    public void addElementAtStart(T node){
        Node<T> element = new Node<>(node);
        if (isEmpty()){
            this.head = element;
            this.size++;
            return;
        }
        var aux = this.head;
        this.head = element;
        this.head.setNext(aux);
        this.size++;
    }
    public void addAtAnyIndex(T node, int index){
        if (isEmpty()){
            this.addElementAtStart(node);
            return;
        }
        Node<T> element = new Node<>(node);
        var aux = this.getNodeAtIndex(index - 1);
        element.setNext(aux.getNext());
        aux.setNext(element);
        this.size++;
    }

    public int indexOf(T node){
        var current = this.head;
        var index = 0;
        while (current != null){
            if (current.getValue().equals(node)){
                return index;
            }
            current = current.getNext();
            index++;
        }
        return -1;
    }
    public boolean elementExists(T node){
        return indexOf(node) != -1;
    }

    public void getLinkedList(){
        var current = this.head;
        while (current != null){
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
    public Node<T> getNodeAtIndex(int index){
        if (index < 0 && index > this.size){
            return null;
        }
        if (index == 0 ){
            return this.head;
        }
        var current = this.head;
        int count = 0;
        while (count != index){
            current = current.getNext();
            count++;
        }
        return current;
    }

    public boolean isEmpty(){
        return this.head == null;
    }

    public void clearList(){
        this.head = null;
        this.size = 0;
    }
    public T removeAtIndex(int index){
        if (isEmpty() || this.getNodeAtIndex(index) == null){
            return null;
        }
        if (index == 0){
            var item = this.head.getValue();
            this.head = this.head.getNext();
            this.size--;
            return item;
        }
        if (index == this.size - 1){
            var aux = getNodeAtIndex(index - 1);
            var item = aux.getNext().getValue();
            aux.setNext(null);
            this.size--;
            return item;
        }
        var aux = getNodeAtIndex(index - 1);
        var item = aux.getNext().getValue();
        aux.setNext(aux.getNext().getNext());
        return item;
    }
    public boolean removeIfContains(T node){
        var index = indexOf(node);
        if (index != -1){
            removeAtIndex(index);
            return true;
        }
        return false;
    }
}
