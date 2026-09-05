package STEP_SEM3.Assignment_Problems;

public class Problems_2 {
    public static void checkPalindrome(String str) {
        // Remove non-alphanumeric characters and convert to lowercase
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                System.out.println("Not a palindrome.");
                return;
            }
            left++;
            right--;
        }
        System.out.println("Is a palindrome.");
    }

    public static void main(String[] args) {
        checkPalindrome("A man a plan a canal Panama");
        checkPalindrome("race a car");
    }
}
