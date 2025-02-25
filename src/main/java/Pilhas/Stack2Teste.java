package Pilhas;

public class Stack2Teste {
    public static void main(String[] args) {
        Stack2<Integer> stack2 = new Stack2<>();
        System.out.println(stack2.isEmpty());
        System.out.println("Tamanho: "+ stack2.size());
        stack2.push(2);
        stack2.push(8);
        System.out.println("------------------\nAntes de remover:");
        System.out.println("Tamanho: " + stack2.size());
        stack2.getAll();
        stack2.pop();
        System.out.println("-------------------------\nApós remover:");
        System.out.println("Tamanho:" + stack2.size());
        stack2.getAll();
        stack2.clear();
        System.out.println(stack2.isEmpty());
    }
}
