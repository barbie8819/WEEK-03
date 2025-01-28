package doublyLinkedList.LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement();

        library.addBookAtEnd("Book A", "Author X", "Fiction", 101, true);
        library.addBookAtBeginning("Book B", "Author Y", "Science", 102, false);
        library.addBookAtPosition("Book C", "Author X", "Mystery", 103, true, 1);

        library.displayBooksForward();

        library.searchByTitle("Book A");
        library.searchByAuthor("Author X");

        library.updateAvailability(102, true);

        library.displayBooksReverse();

        System.out.println("Total Books in Library: " + library.countTotalBooks());

        library.removeBookById(101);

        library.displayBooksForward();
    }

}
