package Arrays;

public class Exercicio3 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findEvenNums(nums));
    }
    public static int findEvenNums(int[] nums){
        int even = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                even++;
            }
        }
        return even;
    }
}
