import java.util.List;

public class MakePayment {

    PaymentState currentPaymentState;
    Client client;
    private Movie selectedMovie;
    private List<String> addedFood;

    private List<String> addedSouvenir;

    public PaymentState getState() {
        return this.currentPaymentState;
    }

    public void setState(PaymentState state) {
        this.currentPaymentState = state;
    }
    Seats seats;
    public MakePayment(Client client,Movie selectedMovie,Seats seats,List<String> food,List<String> souvenirs ) {
        this.client = client;
        this.currentPaymentState = PayByCash.getInstance();
        this.selectedMovie = selectedMovie;
        this.seats = seats;
        this.addedFood = food;
        this.addedSouvenir = souvenirs;
    }

    public void push(int paymentType) {
        switch (paymentType) {
            case 1:
                this.currentPaymentState = PayByCard.getInstance();
                System.out.println("Payment type set to Card");
                break;
            case 2:
                this.currentPaymentState = PayByCash.getInstance();
                System.out.println("Payment type set to Cash");
                break;
            case 3:
                this.currentPaymentState = PayByLoyaltyPoints.getInstance();
                System.out.println("Payment type set to Loyalty Points");
                break;
            default:
                System.out.println("Invalid payment type");
                return;
        }
        this.currentPaymentState.processPayment(this.client,this);
    }
    public double getMoviePrice() {
        int reservedSeats = seats.getSeatsReserved();
        if (reservedSeats > 0) {
            return selectedMovie.getPrice() * reservedSeats;
        } else {
            return selectedMovie.getPrice();
        }
    }
    public double getFoodDrinksPrices() {
        double prices = 0;
        double basicPrice = 20;

        if (addedFood.size() > 0) {
            for (int i =0; i<addedFood.size(); i++){
                prices += basicPrice;
            }
            return prices;
        } else {
            return 0;
        }
    }

    public double getSouvenirPrices() {
        double prices = 0;
        double basicPrice = 40;

        if (addedSouvenir.size() > 0) {
            for (int i =0; i<addedSouvenir.size(); i++){
                prices += basicPrice;
            }
            return prices;
        } else {
            return 0;
        }
    }

}