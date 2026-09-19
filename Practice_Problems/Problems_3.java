package STEP_SEM3.Practice_Problems;

class Problems_3 {
    String code;
    String title;
    int credits;
    int labCredits;

    // 4-argument constructor setting all fields
    public Problems_3(String code, String title, int credits, int labCredits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.labCredits = labCredits;
    }

    // 3-argument constructor chaining to 4-argument constructor via this(...)
    public Problems_3(String code, String title, int credits) {
        this(code, title, credits, 0);
    }

    // Calculates and returns total credits
    public int totalCredits() {
        return credits + labCredits;
    }

    public static void main(String[] args) {
        // Theory-only course using 3-argument constructor
        Problems_3 theoryCourse = new Problems_3("21CSC201J", "Data Structures", 4);
        System.out.println(theoryCourse.code + " total credits: " + theoryCourse.totalCredits());

        // Integrated course with lab using 4-argument constructor
        Problems_3 labCourse = new Problems_3("21CSC205L", "DSA Lab", 3, 1);
        System.out.println(labCourse.code + " total credits: " + labCourse.totalCredits());
    }
}