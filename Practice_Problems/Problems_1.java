package STEP_SEM3.Practice_Problems;

public class Problems_1 {
    static class Student {
    String name;
    int marks;
}

public static class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Divya";
        s.marks = 88;

        System.out.println("Name: " + s.name + " | Marks: " + s.marks);
    }
}
}
