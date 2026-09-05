package STEP_SEM3.Practice_Problems;

public class Problems_2 {

    // Approach 1: Iterative Two-Pointer
    public static boolean isPalindromeIterative(String text) {
        int left = 0, right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Approach 2: Recursive
    public static boolean isPalindromeRecursive(String text) {
        if (text.length() <= 1) {
            return true;
        }
        if (text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }
        return isPalindromeRecursive(text.substring(1, text.length() - 1));
    }

    // Approach 3: Character Array Reversal
    public static boolean isPalindromeArrayReversal(String text) {
        char[] chars = text.toCharArray();
        char[] reversed = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            reversed[i] = chars[chars.length - 1 - i];
        }
        return new String(chars).equals(new String(reversed));
    }

    public static void verifyPalindrome(String text) {
        String itRes = isPalindromeIterative(text) ? "Palindrome" : "Not Palindrome";
        String recRes = isPalindromeRecursive(text) ? "Palindrome" : "Not Palindrome";
        String revRes = isPalindromeArrayReversal(text) ? "Palindrome" : "Not Palindrome";

        System.out.printf("Input: \"%s\"%n", text);
        System.out.printf("Iterative: %s | Recursive: %s | Array Reversal: %s%n%n", itRes, recRes, revRes);
    }

    public static void main(String[] args) {
        verifyPalindrome("madam");
        verifyPalindrome("hello");
    }
}