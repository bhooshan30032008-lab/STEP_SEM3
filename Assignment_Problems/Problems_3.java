package STEP_SEM3.Assignment_Problems;

public class Problems_3 {
    // Single-pass tracking of min and max without sorting[cite: 1]
    public static String findMinMaxSpread(int[] scores) { //[cite: 1]
        int min = scores[0];
        int max = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
            if (scores[i] > max) {
                max = scores[i];
            }
        }

        int spread = max - min; //[cite: 1]
        return "Min: " + min + " Max: " + max + " Spread: " + spread; //[cite: 1]
    }

    public static void main(String[] args) {
        int[] scores = {45, 82, 79, 90, 33, 90, 61}; //[cite: 1]
        System.out.println(findMinMaxSpread(scores)); // Output: Min: 33 Max: 90 Spread: 57[cite: 1]
    }
}