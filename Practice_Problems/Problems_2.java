package STEP_SEM3.Practice_Problems;

class Problems_2 {
    // Private balance field ensures encapsulation
    private double balance;

    // Constructor initializing opening balance with validation
    public Problems_2(double openingBalance) {
        if (openingBalance < 0) {
            System.out.println("Warning: Opening balance cannot be negative. Initialized to 0.0.");
            this.balance = 0.0;
        } else {
            this.balance = openingBalance;
        }
    }

    // Top-up method
    public void topUp(double amount) {
        if (amount <= 0) {
            System.out.println("Top-up rejected: Amount must be greater than 0.");
        } else {
            this.balance += amount;
            System.out.println("Balance after top-up: " + balance);
        }
    }

    // Deduct method with insufficient balance check
    public void deduct(double amount) {
        if (amount > balance) {
            System.out.println("Deduct rejected: insufficient balance");
        } else {
            this.balance -= amount;
            System.out.println("Deduction successful. New balance: " + balance);
        }
    }

    // Read-only getter for balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Problems_2 wallet = new Problems_2(500);
        wallet.topUp(200);
        wallet.deduct(1000);
        System.out.println("Final balance: " + wallet.getBalance());
    }
}