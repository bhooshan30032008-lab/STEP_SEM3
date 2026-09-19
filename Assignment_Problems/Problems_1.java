package STEP_SEM3.Assignment_Problems;
class Problems_1 {
    String title;
    String author;
    int copiesAvailable;

    public Problems_1(String title, String author, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    public void printEntry() {
        System.out.println(title + " by " + author + " " + copiesAvailable + " copies available");
    }



    public static void main(String[] args) {
        Problems_1[] books = {
            new Problems_1("Clean Code", "Robert C. Martin", 3),
            new Problems_1("Effective Java", "Joshua Bloch", 5),
            new Problems_1("Refactoring", "Martin Fowler", 0),
            new Problems_1("Design Patterns", "GoF", 2)
        };

        for (Problems_1 book : books) {
            book.printEntry();
        }
    }
}
