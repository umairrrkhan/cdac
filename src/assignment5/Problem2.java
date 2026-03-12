package assignment5;

public class Problem2 {

    static class Book {
        String title;
        String author;
        String isbn;

        public Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }

        public void displayBook() {
            System.out.println("Title  : " + title);
            System.out.println("Author : " + author);
            System.out.println("ISBN   : " + isbn);
            System.out.println("----------------------");
        }
    }

    public static void displayLibrary(Book[] library) {
        System.out.println("Library:");

        for (int i = 0; i < library.length; i++) {
            if (library[i] != null) {
                System.out.println("Book " + (i + 1) + ":");
                library[i].displayBook();
            }
        }
    }

    public static void searchBook(Book[] library, String title) {
        System.out.println("Searching for: " + title);
        boolean found = false;

        for (int i = 0; i < library.length; i++) {
            if (library[i] != null && library[i].title.equalsIgnoreCase(title)) {
                System.out.println("Book found at position: " + (i + 1));
                library[i].displayBook();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found: " + title);
        }
    }

    public static void main(String[] args) {
        Book[] library = new Book[2];

        library[0] = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0-7432-7356-5");
        library[1] = new Book("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4");

        displayLibrary(library);

        searchBook(library, "1984");
    }
}