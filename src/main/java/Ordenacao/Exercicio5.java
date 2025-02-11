package Ordenacao;

import java.util.Arrays;


public class Exercicio5 {
    public static void main(String[] args) {
        int[] nums = {5,120,220,55,30,45,12,2034};
        System.out.println(Arrays.toString(quickSort(nums, 0, nums.length - 1)));
    }

    public static int[] quickSort(int[] nums, int left, int right){
        if (left < right){
            int pivot = partition(nums, left, right);
            quickSort(nums, left, pivot - 1);
            quickSort(nums, pivot + 1, right);
        }
        return nums;
    }

    private static int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int i = left;
        for (int j = left; j < right; j++){
            if (nums[j] <= pivot){
                swap(nums, j, i);
                i+=1;
            }
        }
        swap(nums, i, right);
        return i;
    }

    private static void swap(int[] nums, int a, int b) {
        int aux = nums[a];
        nums[a] = nums[b];
        nums[b] = aux;
    }

}
