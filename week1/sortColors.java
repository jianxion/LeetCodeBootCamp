package week1;

import java.util.Arrays;

public class sortColors {

    public void sortColors(int[] nums) {
        // in place, one-pass
        if (nums == null || nums.length <= 1) return;
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                int tmp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = tmp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else { // nums[mid] == 2
                int tmp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = tmp;
                high--;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        System.out.println("before: " + Arrays.toString(nums));
        new sortColors().sortColors(nums);
        System.out.println("after:  " + Arrays.toString(nums));
    }
}
