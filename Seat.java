import java.util.ArrayList;
import java.util.List;
class Seat {
    private String row;
    private int seatNumber;
    private boolean isReserved;

    public Seat(String row, int seatNumber) {
        this.row = row;
        this.seatNumber = seatNumber;
        this.isReserved = false;
    }

    public String getSeatLabel() {
        return row + seatNumber;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void reserve() {
        isReserved = true;
    }
}