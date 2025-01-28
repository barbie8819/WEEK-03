package doublyLinkedList.LibraryManagementSystem;

public class LibraryManagement {
    class Book {
        String title;
        String author;
        String genre;
        int bookId;
        boolean isAvailable;
        Book next;
        Book prev;

        public Book(String title, String author, String genre, int bookId, boolean isAvailable) {
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.bookId = bookId;
            this.isAvailable = isAvailable;
            this.next = null;
            this.prev = null;
        }
    }
    private Book head;
    private Book tail;

    public LibraryManagement() {
        this.head = null;
        this.tail = null;
    }

    // Add a book at the beginning
    public void addBookAtBeginning(String title, String author, String genre, int bookId, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
    }

    // Add a book at the end
    public void addBookAtEnd(String title, String author, String genre, int bookId, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    // Add a book at a specific position
    public void addBookAtPosition(String title, String author, String genre, int bookId, boolean isAvailable, int position) {
        if (position <= 0 || head == null) {
            addBookAtBeginning(title, author, genre, bookId, isAvailable);
            return;
        }
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        Book temp = head;
        for (int i = 0; i < position - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        newBook.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newBook;
        }
        temp.next = newBook;
        newBook.prev = temp;
        if (newBook.next == null) {
            tail = newBook;
        }
    }

    // Remove a book by Book ID
    public void removeBookById(int bookId) {
        if (head == null) {
            System.out.println("No books to remove.");
            return;
        }
        Book temp = head;
        while (temp != null && temp.bookId != bookId) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Book not found: " + bookId);
            return;
        }
        if (temp == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        } else {
            temp.prev.next = temp.next;
        }
        if (temp == tail) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            }
        } else if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        System.out.println("Book removed: " + bookId);
    }

    // Search for a book by Title
    public void searchByTitle(String title) {
        Book temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                System.out.println("Book Found: " + temp.title + " | Author: " + temp.author + " | Genre: " + temp.genre + " | Available: " + temp.isAvailable);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found: " + title);
    }

    // Search for a book by Author
    public void searchByAuthor(String author) {
        Book temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                System.out.println("Book Found: " + temp.title + " | Author: " + temp.author + " | Genre: " + temp.genre + " | Available: " + temp.isAvailable);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No books found by author: " + author);
        }
    }

    // Update a book's Availability Status
    public void updateAvailability(int bookId, boolean isAvailable) {
        Book temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = isAvailable;
                System.out.println("Availability updated for Book ID: " + bookId);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found: " + bookId);
    }

    // Display all books in forward order
    public void displayBooksForward() {
        if (head == null) {
            System.out.println("No books in the library.");
            return;
        }
        Book temp = head;
        System.out.println("Library Books (Forward):");
        while (temp != null) {
            System.out.println(temp.bookId + " | " + temp.title + " | Author: " + temp.author + " | Genre: " + temp.genre + " | Available: " + temp.isAvailable);
            temp = temp.next;
        }
    }

    // Display all books in reverse order
    public void displayBooksReverse() {
        if (tail == null) {
            System.out.println("No books in the library.");
            return;
        }
        Book temp = tail;
        System.out.println("Library Books (Reverse):");
        while (temp != null) {
            System.out.println(temp.bookId + " | " + temp.title + " | Author: " + temp.author + " | Genre: " + temp.genre + " | Available: " + temp.isAvailable);
            temp = temp.prev;
        }
    }

    // Count the total number of books in the library
    public int countTotalBooks() {
        int count = 0;
        Book temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
