package STEP_SEM3.Practice_Problems;
  import java.util.*;
public  class Problem_1 {


static abstract class Transaction {
    protected double amount;

    public Transaction(double amount) {
        this.amount = amount;
    }

    public abstract double calculateAdjustedAmount();
    public abstract String getTypeName();
}

static class CardTransaction extends Transaction {
    public CardTransaction(double amount) {
        super(amount);
    }

    @Override
    public double calculateAdjustedAmount() {
        return amount * 1.02; // 2% fee
    }

    @Override
    public String getTypeName() {
        return "CARD";
    }
}

static class WalletTransaction extends Transaction {
    public WalletTransaction(double amount) {
        super(amount);
    }

    @Override
    public double calculateAdjustedAmount() {
        return amount * 1.01; // 1% fee
    }

    @Override
    public String getTypeName() {
        return "WALLET";
    }
}

static class BankTransferTransaction extends Transaction {
    public BankTransferTransaction(double amount) {
        super(amount);
    }

    @Override
    public double calculateAdjustedAmount() {
        return amount; // 0% fee
    }

    @Override
    public String getTypeName() {
        return "BANKTRANSFER";
    }
}

public static class PaymentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;

        int n = scanner.nextInt();
        List<Transaction> transactions = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String type = scanner.next();
            double amount = scanner.nextDouble();

            switch (type) {
                case "CARD":
                    transactions.add(new CardTransaction(amount));
                    break;
                case "WALLET":
                    transactions.add(new WalletTransaction(amount));
                    break;
                case "BANKTRANSFER":
                    transactions.add(new BankTransferTransaction(amount));
                    break;
            }
        }

        double total = 0.0;
        // Uniform polymorphic processing
        for (Transaction tx : transactions) {
            double adjusted = tx.calculateAdjustedAmount();
            total += adjusted;
            System.out.printf("%s: %.2f\n", tx.getTypeName(), adjusted);
        }

        System.out.printf("Total: %.2f\n", total);
        scanner.close();
    }
}
}


