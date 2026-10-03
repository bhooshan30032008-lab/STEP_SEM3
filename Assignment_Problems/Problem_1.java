package STEP_SEM3.Assignment_Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem_1 {
    abstract static class GardenPlot {
        protected String owner;
        protected String shape;

        public GardenPlot(String owner, String shape) {
            this.owner = owner;
            this.shape = shape;
        }

        public abstract double calculateArea();

        public void printReport() {
            System.out.printf("%s (%s): %.2f\n", owner, shape, calculateArea());
        }
    }

    static class CircularPlot extends GardenPlot {
        private double radius;

        public CircularPlot(String owner, double radius) {
            super(owner, "CIRCLE");
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    static class RectangularPlot extends GardenPlot {
        private double length;
        private double width;

        public RectangularPlot(String owner, double length, double width) {
            super(owner, "RECTANGLE");
            this.length = length;
            this.width = width;
        }

        @Override
        public double calculateArea() {
            return length * width;
        }
    }

    static class TriangularPlot extends GardenPlot {
        private double base;
        private double height;

        public TriangularPlot(String owner, double base, double height) {
            super(owner, "TRIANGLE");
            this.base = base;
            this.height = height;
        }

        @Override
        public double calculateArea() {
            return 0.5 * base * height;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            return;
        }

        int n = sc.nextInt();
        List<GardenPlot> plots = new ArrayList<>();
        double totalArea = 0.0;

        for (int i = 0; i < n; i++) {
            String shapeType = sc.next();
            String owner = sc.next();

            if (shapeType.equalsIgnoreCase("CIRCLE")) {
                double r = sc.nextDouble();
                plots.add(new CircularPlot(owner, r));
            } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
                double l = sc.nextDouble();
                double w = sc.nextDouble();
                plots.add(new RectangularPlot(owner, l, w));
            } else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
                double b = sc.nextDouble();
                double h = sc.nextDouble();
                plots.add(new TriangularPlot(owner, b, h));
            }
        }

        for (GardenPlot plot : plots) {
            plot.printReport();
            totalArea += plot.calculateArea();
        }

        System.out.printf("Total Area: %.2f\n", totalArea);
    }
}