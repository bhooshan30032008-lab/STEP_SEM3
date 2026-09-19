package STEP_SEM3.Practice_Problems;

class Problems_1 {
    String studentName;
    String company;
    double packageLpa;

    // Constructor to initialize all three fields
    public Problems_1 (String studentName, String company, double packageLpa) {
        this.studentName = studentName;
        this.company = company;
        this.packageLpa = packageLpa;
    }

    // Instance method to print one formatted line
    public void printRecord() {
        System.out.println(studentName + " -> " + company + " @ " + packageLpa + " LPA");
    }


    public static void main(String[] args) {
        // Create an array of PlacementRecord objects
        Problems_1 [] records = {
            new Problems_1 ("Ravi", "TCS", 4.5),
            new Problems_1 ("Anitha", "Zoho", 6.2),
            new Problems_1 ("Karthik", "Infosys", 4.0)
        };

        // Print each record in a loop
        for (Problems_1 record : records) {
            record.printRecord();
        }
    }
}