package STEP_SEM3.Practice_Problems;

import java.util.*;

public class Problem_2 {

    static abstract class StaffMember {
        protected String name;

        public StaffMember(String name) {
            this.name = name;
        }

        public abstract double calculatePay();

        public void printPay() {
            System.out.printf("%s: %.2f\n", name, calculatePay());
        }
    }

    static class FullTimeStaff extends StaffMember {
        private double weeklySalary;

        public FullTimeStaff(String name, double weeklySalary) {
            super(name);
            this.weeklySalary = weeklySalary;
        }

        @Override
        public double calculatePay() {
            return weeklySalary;
        }
    }

    static class HourlyStaff extends StaffMember {
        private double hours;
        private double rate;

        public HourlyStaff(String name, double hours, double rate) {
            super(name);
            this.hours = hours;
            this.rate = rate;
        }

        @Override
        public double calculatePay() {
            if (hours <= 40) {
                return hours * rate;
            } else {
                return (40 * rate) + ((hours - 40) * 1.5 * rate);
            }
        }
    }

    static class InternStaff extends StaffMember {
        private double stipend;

        public InternStaff(String name, double stipend) {
            super(name);
            this.stipend = stipend;
        }

        @Override
        public double calculatePay() {
            return stipend;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;

        int n = sc.nextInt();
        List<StaffMember> staffList = new ArrayList<>();
        double totalPayroll = 0.0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();

            if (type.equalsIgnoreCase("FULLTIME")) {
                double salary = sc.nextDouble();
                staffList.add(new FullTimeStaff(name, salary));
            } else if (type.equalsIgnoreCase("HOURLY")) {
                double hours = sc.nextDouble();
                double rate = sc.nextDouble();
                staffList.add(new HourlyStaff(name, hours, rate));
            } else if (type.equalsIgnoreCase("INTERN")) {
                double stipend = sc.nextDouble();
                staffList.add(new InternStaff(name, stipend));
            }
        }

        for (StaffMember staff : staffList) {
            staff.printPay();
            totalPayroll += staff.calculatePay();
        }

        System.out.printf("Total Payroll: %.2f\n", totalPayroll);
        sc.close();
    }
}