public class PayByLoyaltyPoints extends PaymentState {

    private static PayByLoyaltyPoints instance = new PayByLoyaltyPoints();

    private PayByLoyaltyPoints() {
    }

    public static PayByLoyaltyPoints getInstance() {
        return instance;
    }

    @Override
    public void processPayment(Client client, MakePayment makePayment) {
        double Price = makePayment.getMoviePrice() + makePayment.getSouvenirPrices() + makePayment.getFoodDrinksPrices();
        int loyaltyPoints = client.getLoyaltyPoints();
        if (loyaltyPoints >= Price) {
            client.setLoyaltyPoints(loyaltyPoints - (int) Price);
            System.out.println("Payment processed by loyalty points. Remaining loyalty points: " + client.getLoyaltyPoints());
        } else {
            System.out.println("Insufficient loyalty points for payment");
        }
    }
}
