package Filas;

import java.util.LinkedList;
import java.util.Queue;

public class Tickets {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        int[] tickets = {5,1,1,1};
        int k = 0;
        for (int i = 0; i < tickets.length; i++){
            queue.add(i);

        }
        int count = 0;
        int time = 0;
        while (tickets[k] > 0){
            if (tickets[count] > 0) {
                tickets[count] = tickets[count] - 1;
                int person = queue.remove();
                queue.add(person);
                count = (count + 1) % tickets.length;
                time++;
            }else{
                count = (count + 1) % tickets.length;
            }
        }
        System.out.println(time);
    }
}
