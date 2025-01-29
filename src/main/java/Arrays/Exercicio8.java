package Arrays;

import java.util.Arrays;

public class Exercicio8 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        System.out.println(Arrays.toString(rearrangeArray(nums1,3, nums2,3)));
    }
    public static int[] rearrangeArray(int[] nums1,int num1, int[] nums2, int num2){
        int aux = 0;
        for(int i = 0; i < nums1.length; i++){
            if (i >= num1){
                nums1[i] = nums2[aux];
                aux++;
            }
        }
        Arrays.sort(nums1);
        return nums1;
    }
}
