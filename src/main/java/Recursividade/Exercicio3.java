package Recursividade;

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println(fibonacciTail(10, 0, 1));
    }

    public static int fibonacci(int n){
        if (n <= 1){
            return n;
        }else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static int fibonacciTail(int n, int o, int p){
        if (n == 1){
            return p;
        }if (n == 0){
            return o;
        }
        return fibonacciTail(n - 1, p, o + p);
    }
}
