package STEP_SEM3.Assignment_Problems;

public class Problems_2 {
    // Nested-loop pairwise comparison without using Collections[cite: 1]
    public static String findDuplicatePick(String[] playerNames) { //[cite: 1]
        for (int i = 0; i < playerNames.length; i++) {
            for (int j = i + 1; j < playerNames.length; j++) { //[cite: 1]
                if (playerNames[i].equals(playerNames[j])) {
                    return "Duplicate Found: " + playerNames[i]; //[cite: 1]
                }
            }
        }
        return "No Duplicates Found"; //[cite: 1]
    }

    public static void main(String[] args) {
        String[] lineup1 = {"Kohli", "Bumrah", "Kohli", "Rohit"}; //[cite: 1]
        System.out.println(findDuplicatePick(lineup1)); // Output: Duplicate Found: Kohli[cite: 1]

        String[] lineup2 = {"Kohli", "Bumrah", "Rohit"}; //[cite: 1]
        System.out.println(findDuplicatePick(lineup2)); // Output: No Duplicates Found[cite: 1]
    }
}