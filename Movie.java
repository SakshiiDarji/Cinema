import java.util.Scanner;
public class Movie {
    private int type;

    private Seats seats;

    private double price;
    public void setType(int type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private final String[] actionMovies = {"The Matrix", "Inception", "Die Hard", "Mad Max"};
    private final String[] comedyMovies = {"Dumb and Dumber", "Anchorman", "Superbad", "Bridesmaids"};
    private final String[] dramaMovies = {"The Shawshank Redemption", "The Godfather", "Forrest Gump", "Schindler's List"};
    private final String[] horrorMovies = {"The Conjuring", "Scream VI", "The Nun", "Saw"};
    public Movie() {}

    public Movie(int type, String name) {
        this.type = type;
        this.name = name;
        this.price = 30;
        this.seats = new Seats();
    }
    public double getPrice() {
        int mySeats = seats.getSeatsReserved();
        if (mySeats > 0) {
            return price * mySeats;
        } else {
            return price;
        }
    }
    public Movie chooseMovie() {
        Scanner scanner = new Scanner(System.in);

        // Choose movie type
        System.out.println("Choose movie type: 1. Action, 2. Comedy, 3. Drama, 4. Horror");
        int movieType = scanner.nextInt();
        scanner.nextLine();

        String[] selectedMovies;

        // Determine the selected movie array based on the movie type
        switch (movieType) {
            case 1:
                selectedMovies = actionMovies;
                break;
            case 2:
                selectedMovies = comedyMovies;
                break;
            case 3:
                selectedMovies = dramaMovies;
                break;
            case 4:
                selectedMovies = horrorMovies;
                break;
            default:
                System.out.println("Invalid movie type. Defaulting to Action.");
                selectedMovies = actionMovies;
                break;
        }

        // Display movie names for the selected type
        System.out.println("Available Movies:");
        for (int i = 0; i < selectedMovies.length; i++) {
            System.out.println((i + 1) + ". " + selectedMovies[i]);
        }

        // Choose movie name
        System.out.println("Choose a movie by entering its number:");
        int chosenMovieIndex = scanner.nextInt() - 1;
        String chosenMovieName = selectedMovies[chosenMovieIndex];

        // Create and return the selected movie
        return new Movie(movieType, chosenMovieName);
    }

    public String getName() {
        return name;
    }

    public int getType() {
        return type;
    }
}
