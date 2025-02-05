package Recursividade;

public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println(fatorial(5, 1));
    }
    public static int fatorial(int n, int start){
        if (n != 0){
            return fatorial(n - 1, start * n);
        }else {
            return start;
        }
    }
}
