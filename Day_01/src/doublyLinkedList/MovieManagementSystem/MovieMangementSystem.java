package doublyLinkedList.MovieManagementSystem;

class MovieManagement {
   public class MovieNode {
        String title;
        String director;
        int year;
        double rating;
        MovieNode next;
        MovieNode prev;

        public MovieNode(String title, String director, int year, double rating) {
            this.title = title;
            this.director = director;
            this.year = year;
            this.rating = rating;
            this.next = null;
            this.prev = null;
        }
    }
    private MovieNode head;
    private MovieNode tail;

    public MovieManagement() {
        head = null;
        tail = null;
    }

    public void addMovieAtBeginning(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addMovieAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void addMovieAtPosition(String title, String director, int year, double rating, int position) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (position <= 0) {
            addMovieAtBeginning(title, director, year, rating);
            return;
        }
        MovieNode current = head;
        int index = 0;
        while (current != null && index < position - 1) {
            current = current.next;
            index++;
        }
        if (current == null) {
            addMovieAtEnd(title, director, year, rating);
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            if (current.next != null) {
                current.next.prev = newNode;
            } else {
                tail = newNode;
            }
            current.next = newNode;
        }
    }

    public void removeMovieByTitle(String title) {
        MovieNode current = head;
        while (current != null) {
            if (current.title.equals(title)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                return;
            }
            current = current.next;
        }
        System.out.println("Movie not found: " + title);
    }

    public void searchByDirector(String director) {
        MovieNode current = head;
        while (current != null) {
            if (current.director.equals(director)) {
                System.out.println("Found: " + current.title + ", Directed by: " + director);
            }
            current = current.next;
        }
    }

    public void searchByRating(double rating) {
        MovieNode current = head;
        while (current != null) {
            if (current.rating == rating) {
                System.out.println("Found: " + current.title + ", Rating: " + rating);
            }
            current = current.next;
        }
    }

    public void displayMoviesForward() {
        MovieNode current = head;
        while (current != null) {
            System.out.println(current.title + " | " + current.director + " | " + current.year + " | " + current.rating);
            current = current.next;
        }
    }

    public void displayMoviesReverse() {
        MovieNode current = tail;
        while (current != null) {
            System.out.println(current.title + " | " + current.director + " | " + current.year + " | " + current.rating);
            current = current.prev;
        }
    }

    public void updateMovieRating(String title, double newRating) {
        MovieNode current = head;
        while (current != null) {
            if (current.title.equals(title)) {
                current.rating = newRating;
                System.out.println("Updated rating for " + title + " to " + newRating);
                return;
            }
            current = current.next;
        }
        System.out.println("Movie not found: " + title);
    }

}
