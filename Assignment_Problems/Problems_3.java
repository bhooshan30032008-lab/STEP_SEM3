package STEP_SEM3.Assignment_Problems;

public class Problems_3 {
    
    String empId;
    String empName;
    double salary;
    boolean isIntern;

    public Problems_3(String empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;
    }

    public Problems_3(String empId, String empName) {
        this(empId, empName, 0.0);
        this.isIntern = true;
    }

    public void printProfile() {
        System.out.println(empId + " | " + empName + " | Rs " + salary + " | Intern: " + isIntern);
    }



    public static void main(String[] args) {
        Problems_3 emp1 = new Problems_3("E101", "Divya", 65000.0);
        Problems_3 emp2 = new Problems_3("E102", "Arjun");

        emp1.printProfile();
        emp2.printProfile();
    }
}