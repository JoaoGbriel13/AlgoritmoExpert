package Dicionarios.Transactions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        String[] data = {"alice,20,800,mtv","alice,50,100,beijing"};
        HashMap<String, List<Transaction>> transactionHashMap = new HashMap<>();
        List<Transaction> allTransactions = new ArrayList<>();
        List<String> invalidTransactions = new ArrayList<>();
        for(String d : data){
            Transaction transaction = new Transaction(d);
            allTransactions.add(transaction);
            transactionHashMap.computeIfAbsent(transaction.name, k -> new ArrayList<>()).add(transaction);
        }
        for (Transaction t : allTransactions){
            if (t.amount > 1000){
                invalidTransactions.add(t.csv);
            }else {
                for (Transaction t2 : transactionHashMap.get(t.name)){
                    if (Math.abs(t.time - t2.time) >= 60 && !t.city.equalsIgnoreCase(t2.city)){
                        invalidTransactions.add(t2.csv);
                    }
                }
            }
        }
        System.out.println(invalidTransactions);
    }
    static class Transaction{
        private String name;
        private int time;
        private int amount;
        private String city;
        private String csv;

        public Transaction(String csv) {
            String[] dataSplit = csv.split(",");
            this.name = dataSplit[0];
            this.time = Integer.parseInt(dataSplit[1]);
            this.amount = Integer.parseInt(dataSplit[2]);
            this.city = dataSplit[3];
            this.csv = csv;
        }

        @Override
        public String toString() {
           return String.format("\"%s,%d,%d,%s\"", name, time, amount, city);
        }
    }
}
