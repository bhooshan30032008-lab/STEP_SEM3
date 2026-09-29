package STEP_SEM3.Assignment_Problems;

import java.util.*;


import java.util.*;

class Problem_1 {
abstract static class Customer {
    protected double billAmount;

    public Customer(double billAmount) {
        this.billAmount = billAmount;
    }

    public abstract double calculateFinalAmount();
    public abstract String getType();
}

static class StudentCustomer extends Customer {
    public StudentCustomer(double billAmount) {
        super(billAmount);
    }

    @Override
    public double calculateFinalAmount() {
        return billAmount * 0.90; 
    }

    @Override
    public String getType() {
        return "STUDENT";
    }
}

static class StaffCustomer extends Customer {
    public StaffCustomer(double billAmount) {
        super(billAmount);
    }

    @Override
    public double calculateFinalAmount() {
        return billAmount * 0.95; 
    }

    @Override
    public String getType() {
        return "STAFF";
    }
}

static class GuestCustomer extends Customer {
    public GuestCustomer(double billAmount) {
        super(billAmount);
    }

    @Override
    public double calculateFinalAmount() {
        return billAmount + 10.0; 
    }

    @Override
    public String getType() {
        return "GUEST";
    }
}

public static  class CanteenBillingCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;

        int n = sc.nextInt();
        List<Customer> bills = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double amount = sc.nextDouble();

            switch (type) {
                case "STUDENT":
                    bills.add(new StudentCustomer(amount));
                    break;
                case "STAFF":
                    bills.add(new StaffCustomer(amount));
                    break;
                case "GUEST":
                    bills.add(new GuestCustomer(amount));
                    break;
            }
        }

        double grandTotal = 0.0;
        
        for (Customer customer : bills) {
            double finalAmount = customer.calculateFinalAmount();
            grandTotal += finalAmount;
            System.out.printf("%s: %.2f\n", customer.getType(), finalAmount);
        }

        System.out.printf("Total: %.2f\n", grandTotal);
        sc.close();
    }
}
}