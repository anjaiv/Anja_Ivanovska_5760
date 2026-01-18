import java.util.ArrayList;

public class MovieManager {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Inception", "Christopher Nolan", 8.8));
        movies.add(new Movie("The Shawshank Redemption", "Frank Darabont", 9.3));
        movies.add(new Movie("The Room", "Tommy Wiseau", 3.7));
        movies.add(new Movie("Parasite", "Bong Joon-ho", 8.5));
        movies.add(new Movie("Twilight", "Catherine Hardwicke", 5.3));

        System.out.println("All Movies:");
        for (Movie m : movies) {
            m.displayMovieInfo();
        }

        System.out.println("\nRecommended Movies:");
        for (Movie m : movies) {
            if (m.isRecommended()) {
                m.displayMovieInfo();
            }
        }
    }
}

class Movie {
        private String title;
    private String director;
    private double rating;

    public Movie(String title, String director, double rating) {
        this.title = title;
        this.director = director;
                this.rating = rating;
    }

    public boolean isRecommended() {
        return rating >= 7.5;
    }

    public void displayMovieInfo() {
        System.out.println("Movie: \"" + title + "\" directed by " + director + ", Rating: " + rating + "/10");
    }
}