package STEP_SEM3.Practice_Problems;

public class Problems_2 {
   static  class HostelRoom {
    String roomNo;
    int occupied;
}

public static class Main {
    public static void main(String[] args) {
        HostelRoom roomA = new HostelRoom();
        roomA.roomNo = "C-101";

        HostelRoom roomB = new HostelRoom();
        roomB.roomNo = "C-102";

        roomA.occupied++;
        roomA.occupied++;
        roomA.occupied++;

        System.out.println("C101 -occupied: " + roomA.occupied);
        System.out.println("C102 -occupied: " + roomB.occupied);
    }
}
}
