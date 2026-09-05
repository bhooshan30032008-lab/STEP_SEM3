package STEP_SEM3.Assignment_Problems;
import java.util.Arrays;

public class Problems_1 {
    // Directly modifies the caller's array in-place[cite: 1]
    public static void applyMultipliers(double[] playerScores, int captainIndex, int viceCaptainIndex) { //[cite: 1]
        playerScores[captainIndex] *= 2.0;       // Captain multiplier: 2x[cite: 1]
        playerScores[viceCaptainIndex] *= 1.5;   // Vice-Captain multiplier: 1.5x[cite: 1]
    }

    public static void main(String[] args) {
        double[] scores = {40.0, 55.0, 30.0, 62.0};
        applyMultipliers(scores, 1, 3);
        System.out.println(Arrays.toString(scores)); // Output: [40.0, 110.0, 30.0, 93.0][cite: 1]
    }
}