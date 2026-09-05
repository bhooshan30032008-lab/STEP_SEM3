package STEP_SEM3.Assignment_Problems;

public class Problems_3 {
    public boolean containsDuplicate(int[] nums) {
        // Compare every element at index i with every element at j[cite: 1]
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true; // Duplicate found[cite: 1]
                }
            }
        }
        return false; // All elements are unique[cite: 1]
    }
    public static void main(String[] args) {
        Problems_3 solution = new Problems_3();
        int[] nums = {1, 2, 3, 4, 5, 1}; // Example input with duplicates
        boolean hasDuplicates = solution.containsDuplicate(nums);
        System.out.println("Contains duplicates: " + hasDuplicates);
    }
}