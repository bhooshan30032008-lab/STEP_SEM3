package STEP_SEM3.Practice_Problems;

public final class Problem_1 {

    private final String id;
    private double savings;

    public Problem_1(String id) {
        this.id = id;
        this.savings = 0.0;
    }

    public String getId() {
        return this.id;
    }

    public double getSavings() {
        return this.savings;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.savings += amount;
            System.out.println("Deposited " + amount + " -> savings = " + (int) this.savings);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.savings) {
            this.savings -= amount;
            System.out.println("Withdrew " + amount + " -> savings = " + (int) this.savings);
        } else {
            System.out.println("Withdrawal of " + amount + " rejected, savings stays " + (int) this.savings);
        }
    }

    public static void main(String[] args) {
        Problem_1 pb = new Problem_1("PB-1");
        pb.deposit(100);
        pb.withdraw(30);
        pb.withdraw(500);
    }
}


