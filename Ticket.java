import java.util.List;

public class Ticket {
    private List<String> reservedSeats;
    private Movie movie;
    private Seats seats;

    public Ticket(List<String> reservedSeats, Movie movie,Seats seats) {
        this.reservedSeats = reservedSeats;
        this.movie = movie;
        this.seats = seats;
    }

    public void displayTicket() {
        System.out.println("------ Ticket ------");
        System.out.println("Movie Name: " + movie.getName());
        System.out.println("Movie Type: " + (movie.getType() == 1 ? "Action" : "Comedy"));
        System.out.println("Reserved Seats: " + String.join(", ", reservedSeats));
        System.out.println("Number of Seats: " + seats.getSeatsReserved());
        System.out.println("--------------------");
    }
}