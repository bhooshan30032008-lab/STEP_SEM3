package STEP_SEM3.Practice_Problems;

public class Problems_3 {
   static  class LibraryCard {
    String holderName;
    int booksIssued;
    boolean active;
}

public static class Main {
    public static void main(String[] args) {
        LibraryCard card = new LibraryCard();

        System.out.println("Holder: " + card.holderName);
        System.out.println("Books Issued: " + card.booksIssued);
        System.out.println("Active: " + card.active);
    }
}
}
