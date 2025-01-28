package doublyLinkedList.MovieManagementSystem;

public class Main {
    public static void main(String[] args) {
        MovieManagement mms = new MovieManagement();

        mms.addMovieAtBeginning("Inception", "Christopher Nolan", 2010, 8.8);
        mms.addMovieAtEnd("The Godfather", "Francis Ford Coppola", 1972, 9.2);
        mms.addMovieAtPosition("The Dark Knight", "Christopher Nolan", 2008, 9.0, 1);

        System.out.println("Movies in forward order:");
        mms.displayMoviesForward();

        System.out.println("\nMovies in reverse order:");
        mms.displayMoviesReverse();

        mms.updateMovieRating("Inception", 9.0);
        mms.removeMovieByTitle("The Godfather");

        System.out.println("\nAfter updates:");
        mms.displayMoviesForward();

        System.out.println("\nSearch by Director 'Christopher Nolan':");
        mms.searchByDirector("Christopher Nolan");

        System.out.println("\nSearch by Rating 9.0:");
        mms.searchByRating(9.0);
    }

}
