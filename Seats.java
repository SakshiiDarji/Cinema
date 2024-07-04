import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Seats {
    private List<Seat> seatList;
    private List<Seat> seatVipList;
    private Scanner scanner;
    private int seatsReserved = 0;

    private int type;
    public Seats(){}
    public Seats(int type) {
        seatList = new ArrayList<>();
        seatVipList = new ArrayList<>();
        scanner = new Scanner(System.in);
        initializeSeats(type);
      //  initializeVipSeats();
        this.type = type;
    }
    public int getSeatsReserved() {
        return seatsReserved;
    }

    public void setSeatsReserved(int seatsReserved) {
        this.seatsReserved += seatsReserved;
    }
    private void initializeSeats(int type) {
        if(type == 2){
        String[] rows = {"A", "B", "C", "D", "E", "F","G"};
        int seatsPerRow = 8;

        for (String row : rows) {
            for (int seatNumber = 1; seatNumber <= seatsPerRow; seatNumber++) {
                Seat seat = new Seat(row, seatNumber);
                seatList.add(seat);
            }
        }
        }
        if(type == 1){
            String[] rows = {"A", "B", "C", "D", "E"};
            int seatsPerRow = 6;

            for (String row : rows) {
                for (int seatNumber = 1; seatNumber <= seatsPerRow; seatNumber++) {
                    Seat seat = new Seat(row, seatNumber);
                    seatVipList.add(seat);
                }
            }
        }
    }

    public void displaySeats(int type) {
        if(type == 2){
        System.out.println("Cinema Regular Seats:");

        String[] rows = {"A", "B", "C", "D", "E", "F", "G"};
        int seatsPerRow = 8;

        for (String row : rows) {
            System.out.print(row + ": ");

            for (int seatNumber = 1; seatNumber <= seatsPerRow; seatNumber++) {
                Seat seat = getSeat(row, seatNumber,type);

                if (seat.isReserved()) {
                    System.out.print("X ");
                } else {
                    System.out.print(seat.getSeatLabel() + " ");
                }
            }

            System.out.println(); // Move to the next line after each row
        }
        }
        if(type == 1 ) {
            System.out.println("Cinema VIP Seats:");

            String[] rows = {"A", "B", "C", "D", "E"};
            int seatsPerRow = 6;

            for (String row : rows) {
                System.out.print(row + ": ");

                for (int seatNumber = 1; seatNumber <= seatsPerRow; seatNumber++) {
                    Seat seat = getSeat(row, seatNumber,type);

                    if (seat.isReserved()) {
                        System.out.print("X ");
                    } else {
                        System.out.print(seat.getSeatLabel() + " ");
                    }
                }

                System.out.println(); // Move to the next line after each row
            }
        }
    }

    private Seat getSeat(String row, int seatNumber,int type) {
        if(type == 2){
        for (Seat seat : seatList) {
            if (seat.getSeatLabel().equalsIgnoreCase(row + seatNumber)) {
                return seat;
            }
        }
        }
        if(type == 1 ){
            for (Seat seat : seatVipList) {
                if (seat.getSeatLabel().equalsIgnoreCase(row + seatNumber)) {
                    return seat;
                }
            }
        }
        return null;
    }

    public List<String> reserveSeatsInteractive(int type) {
        List<String> reservedSeats = new ArrayList<>();


        displaySeats(type);
        String input;
        while (true) {
            System.out.print("Enter seat labels to reserve or enter '2' to go back to the menu: ");
            input = scanner.next().toUpperCase();

            if (input.equals("2")) {
                break;
            }

            boolean reservationSuccessful = reserveSeat(input,type);
            if (reservationSuccessful) {
                System.out.println("Seat " + input + " reserved successfully.");
                reservedSeats.add(input);
            } else {
                System.out.println("Seat " + input + " is either already reserved or invalid. Try another seat.");
            }
            System.out.println("\n");

            // Display available seats after each reservation attempt
            displaySeats(type);

        }

        return reservedSeats;
    }

    public boolean reserveSeat(String seatLabel,int type) {
        if(this.type == 2) {
            for (Seat seat : seatList) {
                if (seat.getSeatLabel().equalsIgnoreCase(seatLabel) && !seat.isReserved()) {
                    seat.reserve();
                    setSeatsReserved(1);
                    return true;
                }
            }
        }
        if(this.type == 1){
            for (Seat seat : seatVipList) {
                if (seat.getSeatLabel().equalsIgnoreCase(seatLabel) && !seat.isReserved()) {
                    seat.reserve();
                    setSeatsReserved(1);
                    return true;
                }
            }
        }
        return false;
    }

    public List<String> getReservedSeats() {
        List<String> reservedSeats = new ArrayList<>();
        for (Seat seat : seatList) {
            if (seat.isReserved()) {
                reservedSeats.add(seat.getSeatLabel());
            }
        }
        return reservedSeats;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}