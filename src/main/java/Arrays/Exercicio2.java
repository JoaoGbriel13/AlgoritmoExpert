package Arrays;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] nums1 = {0,1,0,0,2,0,0};
        int[] nums2 = {1,0,0,0,3,0,4};
        System.out.println(dotProduct(nums1,nums2));
    }

    public static int dotProduct(int[] numb1, int[] numb2){
        int product = 0;
        for (int i = 0; i < numb1.length; i++){
            int count = numb1[i] * numb2[i];
            product+= count;
        }
        return product;
    }

}
