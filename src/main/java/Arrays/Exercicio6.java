package Arrays;

import java.util.Arrays;

public class Exercicio6 {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquaredArray(nums)));
    }

    public static int[] sortedSquaredArray(int[] nums){
        for (int i = 0; i < nums.length; i++){
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
