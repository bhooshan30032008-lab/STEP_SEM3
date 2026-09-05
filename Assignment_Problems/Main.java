package STEP_SEM3.Assignment_Problems;

class ExamHall {
    String hallName;
    int seatsFilled;
}

public class Main {
    public static void main(String[] args) {
        ExamHall hallA = new ExamHall();
        hallA.hallName = "Block-3 Hall A";

        ExamHall hallB = new ExamHall();
        hallB.hallName = "Block-3 Hall B";

        // Increment seatsFilled for hallA four times
        hallA.seatsFilled++;
        hallA.seatsFilled++;
        hallA.seatsFilled++;
        hallA.seatsFilled++;

        System.out.println(hallA.hallName + " seats Filled: " + hallA.seatsFilled);
        System.out.println(hallB.hallName + " seats Filled: " + hallB.seatsFilled);
    }
}