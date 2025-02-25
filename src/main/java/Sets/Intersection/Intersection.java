package Sets.Intersection;

import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        Integer[] num1 = {4,9,5};
        Integer[] num2 = {9,4,8,6,7};

        System.out.println(Arrays.toString(Arrays.stream(num1).filter(item -> Arrays.asList(num2).contains(item)).distinct().toArray()));
    }


}
