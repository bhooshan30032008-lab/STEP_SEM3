package STEP_SEM3.Practice_Problems;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.*;
public  class Problem_2 {
   
   

static abstract class LibraryItem {
    protected String title;

    public LibraryItem(String title) {
        this.title = title;
    }

    public abstract int getLoanDays();

    public String calculateDueDate(LocalDate currentDate) {
        LocalDate dueDate = currentDate.plusDays(getLoanDays());
        return dueDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public String getTitle() {
        return title;
    }
}

static class Book extends LibraryItem {
    public Book(String title) {
        super(title);
    }

    @Override
    public int getLoanDays() {
        return 14;
    }
}

static class DVD extends LibraryItem {
    public DVD(String title) {
        super(title);
    }

    @Override
    public int getLoanDays() {
        return 7;
    }
}

static class Magazine extends LibraryItem {
    public Magazine(String title) {
        super(title);
    }

    @Override
    public int getLoanDays() {
        return 3;
    }
}

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextLine()) return;

        int n = Integer.parseInt(scanner.nextLine().trim());
        LocalDate currentDate = LocalDate.parse("2023-10-26");
        List<LibraryItem> items = new ArrayList<>();

        Pattern pattern = Pattern.compile("^([A-Z]+)\\s+\"?([^\"]+)\"?$");

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine().trim();
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                String type = matcher.group(1);
                String title = matcher.group(2);

                switch (type) {
                    case "BOOK":
                        items.add(new Book(title));
                        break;
                    case "DVD":
                        items.add(new DVD(title));
                        break;
                    case "MAGAZINE":
                        items.add(new Magazine(title));
                        break;
                }
            }
        }

        // Uniform polymorphic invocation
        for (LibraryItem item : items) {
            System.out.printf("%s: %s\n", item.getTitle(), item.calculateDueDate(currentDate));
        }

        scanner.close();
    }
}



