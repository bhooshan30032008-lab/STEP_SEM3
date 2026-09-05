package STEP_SEM3.Assignment_Problems;
public class Problems_1 {


public static class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Nested loops to check every unique pair (i, j)
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; //
                }
            }
        }
        return new int[]{};
    }
}
public static void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    int[] result = solution.twoSum(nums, target);
    if (result.length == 2) {
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    } else {
        System.out.println("No solution found.");
    }
}
}
