package Pilhas;

public class Stack1Teste {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(3);
        stack.push(1);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.isFull());
        System.out.println(stack.peek());
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        stack.clear();
        System.out.println(stack.isEmpty());
    }
}
