package STEP_SEM3.Assignment_Problems; 
import java.util.*;

public class Problem_2 {
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
            return billAmount * 0.90; // 10% discount
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

abstract static class Vehicle {
    protected int hours;

    public Vehicle(int hours) {
        this.hours = hours;
    }

    public abstract double calculateCharge();
    public abstract String getType();
}

static class Bike extends Vehicle {
    public Bike(int hours) {
        super(hours);
    }

    @Override
    public double calculateCharge() {
        return hours * 10.0;
    }

    @Override
    public String getType() {
        return "BIKE";
    }
}

static class Car extends Vehicle {
    public Car(int hours) {
        super(hours);
    }

    @Override
    public double calculateCharge() {
       
        return 30.0 + Math.max(0, hours - 1) * 20.0;
    }

    @Override
    public String getType() {
        return "CAR";
    }
}

static class Truck extends Vehicle {
    public Truck(int hours) {
        super(hours);
    }

    @Override
    public double calculateCharge() {
      
        return Math.max(100.0, hours * 50.0);
    }

    @Override
    public String getType() {
        return "TRUCK";
    }
}

static class ParkingChargeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;

        int n = sc.nextInt();
        List<Vehicle> vehicles = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int hours = sc.nextInt();

            switch (type) {
                case "BIKE":
                    vehicles.add(new Bike(hours));
                    break;
                case "CAR":
                    vehicles.add(new Car(hours));
                    break;
                case "TRUCK":
                    vehicles.add(new Truck(hours));
                    break;
            }
        }

        double grandTotal = 0.0;
        // Process polymorphically
        for (Vehicle v : vehicles) {
            double charge = v.calculateCharge();
            grandTotal += charge;
            System.out.printf("%s: %.2f\n", v.getType(), charge);
        }

        System.out.printf("Total: %.2f\n", grandTotal);
        sc.close();
    }
}
}
