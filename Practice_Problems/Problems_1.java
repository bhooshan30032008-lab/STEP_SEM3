package STEP_SEM3.Practice_Problems;

public class Problems_1 {
    public static int[] twoSum(int[] nums, int target) {
        // Iterate through each element with outer loop
        for (int i = 0; i < nums.length; i++) {
            // Check every subsequent element to avoid reusing the same index
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}