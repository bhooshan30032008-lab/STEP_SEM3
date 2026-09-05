package STEP_SEM3.Assignment_Problems;

public class Problems_4 {
    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0;
        int totalB = 0;

        int maxVal = Integer.MIN_VALUE;
        String maxSection = "";
        int maxIndex = -1; // 1-based item index

        // Process Section A
        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
            if (sectionA[i] > maxVal) {
                maxVal = sectionA[i];
                maxSection = "Section A";
                maxIndex = i + 1;
            }
        }

        // Process Section B
        for (int i = 0; i < sectionB.length; i++) {
            totalB += sectionB[i];
            if (sectionB[i] > maxVal) {
                maxVal = sectionB[i];
                maxSection = "Section B";
                maxIndex = i + 1;
            }
        }

        String status = (totalA == totalB) ? "Balanced" : "Not Balanced";

        System.out.println("Section A Total: " + totalA + " | Section B Total: " + totalB +
                " | Status: " + status + " | Highest Quantity: " + maxVal +
                " (" + maxSection + ", Item " + maxIndex + ")");
    }

    public static void main(String[] args) {
        int[] sectionA = {20, 15, 30};
        int[] sectionB = {25, 10, 30};

        analyzeInventory(sectionA, sectionB);
    }
}