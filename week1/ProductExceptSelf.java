package week1;

public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int prefixProduct = 1;
        int[] prefixProductArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            prefixProduct *= nums[i];
            prefixProductArr[i] = prefixProduct;
        }

        int suffixProduct = 1;
        int[] suffixProductArr = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            suffixProduct *= nums[i];
            suffixProductArr[i] = suffixProduct;
        }

        int[] result = new int[nums.length];
        result[0] = suffixProductArr[1];
        result[nums.length - 1] = prefixProductArr[nums.length - 2];
        for (int i = 1; i < nums.length - 1; i++) {
            result[i] = prefixProductArr[i - 1] * suffixProductArr[i + 1];
        }   

        return result;
    }
    

    public static void main(String[] args) {
        ProductExceptSelf solution = new ProductExceptSelf();
        int[] nums = {1, 2, 3, 4};
        int[] result = solution.productExceptSelf(nums);
        System.out.print("Output: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
