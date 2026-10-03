package STEP_SEM3.Practice_Problems;

import java.util.*;

public class Problem_3 {

    static abstract class LibraryItem {
        protected String title;
        protected int daysLate;

        public LibraryItem(String title, int daysLate) {
            this.title = title;
            this.daysLate = daysLate;
        }

        public abstract double calculateFine();

        public void printFine() {
            System.out.printf("%s: %.2f\n", title, calculateFine());
        }
    }

    static class BookItem extends LibraryItem {
        public BookItem(String title, int daysLate) {
            super(title, daysLate);
        }

        @Override
        public double calculateFine() {
            return daysLate * 2.0;
        }
    }

    static class DvdItem extends LibraryItem {
        public DvdItem(String title, int daysLate) {
            super(title, daysLate);
        }

        @Override
        public double calculateFine() {
            return Math.min(daysLate * 5.0, 50.0);
        }
    }

    static class MagazineItem extends LibraryItem {
        public MagazineItem(String title, int daysLate) {
            super(title, daysLate);
        }

        @Override
        public double calculateFine() {
            return daysLate * 1.0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;

        int n = sc.nextInt();
        List<LibraryItem> items = new ArrayList<>();
        double totalFines = 0.0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String title = sc.next();
            int days = sc.nextInt();

            if (type.equalsIgnoreCase("BOOK")) {
                items.add(new BookItem(title, days));
            } else if (type.equalsIgnoreCase("DVD")) {
                items.add(new DvdItem(title, days));
            } else if (type.equalsIgnoreCase("MAGAZINE")) {
                items.add(new MagazineItem(title, days));
            }
        }

        for (LibraryItem item : items) {
            item.printFine();
            totalFines += item.calculateFine();
        }

        System.out.printf("Total Fines: %.2f\n", totalFines);
        sc.close();
    }
}