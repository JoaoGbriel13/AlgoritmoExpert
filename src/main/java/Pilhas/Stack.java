package Pilhas;

public class Stack<T> {
    private int size;
    private T[] arr;
    private int top;

    public Stack() {
        this.arr = (T[]) new Object[100];
        this.top = -1;
    }
    public Stack(int size){
        this.size = size;
        this.arr = (T[]) new Object[size];
        this.top = -1;
    }
    public void push(T element){
        if (!isFull()) {
            this.top++;
            this.arr[this.top] = element;
            return;
        }
        throw new Error("Stack is full");
    }
    public T pop(){
        if (!isEmpty()) {
            T item = this.arr[this.top];
            this.top--;
            return item;
        }
        throw new Error("Stack is empty");
    }
    public T peek(){
        return this.arr[this.top];
    }
    public boolean isFull(){
        return this.top == this.size - 1;
    }
    public boolean isEmpty(){
        return this.top == -1;
    }
    public int count(){
        return this.top + 1;
    }
    public void clear(){
        this.top = -1;
    }

}
