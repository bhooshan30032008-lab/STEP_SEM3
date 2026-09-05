package STEP_SEM3.Practice_Problems;

public class Problems_2 {
    public static String findDuplicateTeam(String[] teamNames) {
        if (teamNames == null) return "No Duplicates Found";

        for (int i = 0; i < teamNames.length; i++) {
            for (int j = i + 1; j < teamNames.length; j++) {
                if (teamNames[i].equals(teamNames[j])) {
                    return "Duplicate Found: " + teamNames[i];
                }
            }
        }
        return "No Duplicates Found";
    }

    public static void main(String[] args) {
        String[] list1 = {"ByteForce", "CodeCrafters", "ByteForce"};
        System.out.println(findDuplicateTeam(list1)); // Output: Duplicate Found: ByteForce

        String[] list2 = {"ByteForce", "CodeCrafters", "NullPointers"};
        System.out.println(findDuplicateTeam(list2)); // Output: No Duplicates Found
    }
}