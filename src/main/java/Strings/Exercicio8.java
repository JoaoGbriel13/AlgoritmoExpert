package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicio8 {
    public static void main(String[] args) {
        String[] transactions = new String[2];
        transactions[0] = "alice,20,800,mtv";
        transactions[1] = "alice,60,100,btv";
        System.out.println(invalidTransactions(transactions));
    }

    public static List<String> invalidTransactions(String[] transactions){
        List<String> result = new ArrayList<>();
        boolean[] invalidArray = new boolean[transactions.length];

        for (int i = 0; i < transactions.length; i++){
            Transaction ti = new Transaction(transactions[i]);

            if (ti.money > 1000){
                invalidArray[i] = true;
            }
            for(int j = i + 1; j < transactions.length; j++){
                Transaction tj = new Transaction(transactions[j]);
                if (ti.name.equalsIgnoreCase(tj.name) && Math.abs(ti.time - tj.time) <= 60 && !ti.city.equalsIgnoreCase(tj.city)){
                    invalidArray[i] = true;
                    invalidArray[j] = true;
                }
            }
        }
        for(int i = 0; i < invalidArray.length; i++){
            if (invalidArray[i]){
                result.add(transactions[i]);
            }
        }
        return result;
    }
    static class Transaction{
        String name;
        int time;
        int money;
        String city;

        public Transaction(String csv){
            String[] parts = csv.split(",");
            this.name = parts[0];
            this.time = Integer.parseInt(parts[1]);
            this.money = Integer.parseInt(parts[2]);
            this.city = parts[3];
        }
    }
}
