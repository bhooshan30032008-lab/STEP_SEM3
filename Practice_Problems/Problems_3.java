package STEP_SEM3.Practice_Problems;

public class Problems_3 {
    public static boolean containsDuplicate(int[] nums) {
        // Nested loops comparing every pair of positions
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // If any two different indices hold the same value
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 1}; // Example input with duplicates
        boolean hasDuplicates = containsDuplicate(nums);
        System.out.println("Contains duplicates: " + hasDuplicates);
    }
}