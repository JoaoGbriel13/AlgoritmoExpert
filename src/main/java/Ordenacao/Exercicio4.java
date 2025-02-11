package Ordenacao;

import java.util.Arrays;

public class Exercicio4 {
    public static void main(String[] args) {
        int[] nums = {2,23,45,12,5,4,19,150,200,100};
        System.out.println(Arrays.toString(mergeSort(nums, 0, nums.length - 1)));
    }
    public static int[] mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(nums, left, middle);
            mergeSort(nums, middle + 1, right);
            merge(nums, left, middle, right);
        }
        return nums;
    }

    private static void merge(int[] nums, int left, int middle, int right) {
        int length = right - left + 1;
        int[] result = new int[length];
        int i = left, j = middle + 1, k = 0;

        while (i <= middle && j <= right) {
            if (nums[i] < nums[j]) {
                result[k++] = nums[i++];
            } else {
                result[k++] = nums[j++];
            }
        }

        while (i <= middle) {
            result[k++] = nums[i++];
        }

        while (j <= right) {
            result[k++] = nums[j++];
        }

        System.arraycopy(result, 0, nums, left, length);
    }
}
