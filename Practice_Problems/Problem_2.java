package STEP_SEM3.Practice_Problems;

public final class Problem_2 {
   
   
    private final boolean[] answers;
    private int recordedCount;

    public Problem_2(int totalQuestions) {
        this.answers = new boolean[totalQuestions];
        this.recordedCount = 0;
    }

    public void recordAnswer(boolean isCorrect) {
        if (recordedCount < answers.length) {
            answers[recordedCount] = isCorrect;
            recordedCount++;
        } else {
            System.out.println("No more answers can be recorded.");
        }
    }

    public int getScore() {
        int score = 0;
        for (int i = 0; i < recordedCount; i++) {
            if (answers[i]) {
                score++;
            }
        }
        return score;
    }

    public static void main(String[] args) {
        Problem_2 sc = new Problem_2(4);
        sc.recordAnswer(true);
        sc.recordAnswer(true);
        sc.recordAnswer(false);
        sc.recordAnswer(true);

        System.out.println("sc.getScore() -> " + sc.getScore());
    }
}


