import java.util.Arrays;
public class Solutions{
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int nonZeroIndex = 0; // Index to keep track of non-zero elements

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // If the current element is non-zero, move it to the nonZeroIndex position
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        // Fill the remaining elements from nonZeroIndex to the end with zeroes
        while (nonZeroIndex < n) {
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }

public static void main(String[] args) {
    int[] nums = {0, 1, 0, 3, 12};
    Solutions solution = new Solutions();
    solution.moveZeroes(nums);
    System.out.println(Arrays.toString(nums)); // Output: [1, 3, 12, 0, 0]
}

}
