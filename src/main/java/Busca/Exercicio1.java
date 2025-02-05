package Busca;

import java.util.Arrays;

public class Exercicio1 {
    public static void main(String[] args) {
        int[] numbs = {2,4,6,15,27,39,58,100,23,52};
        System.out.println(binarySearchRecursive(numbs, 27, 0, numbs.length -1));
    }
    public static int binarySearch(int[] numbs, int key){
        Arrays.sort(numbs);
        int start = 0;
        int end = numbs.length - 1;
        int middle;
        while (start <= end){
            middle = (start + end) / 2;
            if (key < numbs[middle]){
                end = middle - 1;
            }
            else if (key > numbs[middle]){
                start = middle + 1;
            }else {
                return middle;
            }
        }
        return -1;
    }
    public static int binarySearchRecursive(int[] nums, int key, int low, int high){
        Arrays.sort(nums);
        if (low >= high){
            return -1;
        }
        int middle = (low + high) / 2;
        if (nums[middle] == key){
            return middle;
        }
        else if (key > nums[middle]){
            return binarySearchRecursive(nums, key, middle + 1, high);
        }else {
            return binarySearchRecursive(nums, key, low, middle - 1);
        }
    }
}
