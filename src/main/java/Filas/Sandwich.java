package Filas;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Sandwich {
    public static void main(String[] args) {
        Queue<Integer> sandwichs = new LinkedList<>();
        Queue<Integer> students = new LinkedList<>();
        sandwichs.add(0);
        sandwichs.add(1);
        sandwichs.add(1);
        sandwichs.add(0);
        students.add(0);
        students.add(0);
        students.add(1);
        students.add(0);

        var attempts = 0;

        while (!students.isEmpty() && attempts < students.size() ){
            if (Objects.equals(students.peek(), sandwichs.peek())){
                students.remove();
                sandwichs.remove();
                attempts = 0;
            }
            else{
                var student = students.remove();
                students.add(student);
                attempts++;
            }
        }
        System.out.println(students.size());
    }
}
