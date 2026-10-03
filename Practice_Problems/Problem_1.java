package STEP_SEM3.Practice_Problems;

import java.util.*;

public class Problem_1 {

    static abstract class Plot {
        protected String owner;

        public Plot(String owner) {
            this.owner = owner;
        }

        public abstract double getArea();
        public abstract String getShape();

        public void printReport() {
            System.out.printf("%s (%s): %.2f\n", owner, getShape(), getArea());
        }
    }

    static class CirclePlot extends Plot {
        private double radius;

        public CirclePlot(String owner, double radius) {
            super(owner);
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public String getShape() {
            return "CIRCLE";
        }
    }

    static class RectanglePlot extends Plot {
        private double length;
        private double width;

        public RectanglePlot(String owner, double length, double width) {
            super(owner);
            this.length = length;
            this.width = width;
        }

        @Override
        public double getArea() {
            return length * width;
        }

        @Override
        public String getShape() {
            return "RECTANGLE";
        }
    }

    static class TrianglePlot extends Plot {
        private double base;
        private double height;

        public TrianglePlot(String owner, double base, double height) {
            super(owner);
            this.base = base;
            this.height = height;
        }

        @Override
        public double getArea() {
            return 0.5 * base * height;
        }

        @Override
        public String getShape() {
            return "TRIANGLE";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;

        int n = sc.nextInt();
        List<Plot> plots = new ArrayList<>();
        double totalArea = 0.0;

        for (int i = 0; i < n; i++) {
            String shape = sc.next();
            String owner = sc.next();

            if (shape.equalsIgnoreCase("CIRCLE")) {
                double radius = sc.nextDouble();
                plots.add(new CirclePlot(owner, radius));
            } else if (shape.equalsIgnoreCase("RECTANGLE")) {
                double length = sc.nextDouble();
                double width = sc.nextDouble();
                plots.add(new RectanglePlot(owner, length, width));
            } else if (shape.equalsIgnoreCase("TRIANGLE")) {
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                plots.add(new TrianglePlot(owner, base, height));
            }
        }

        for (Plot plot : plots) {
            plot.printReport();
            totalArea += plot.getArea();
        }

        System.out.printf("Total Area: %.2f\n", totalArea);
        sc.close();
    }
}