public class PayByCard extends PaymentState {
    //create a new instance of the PayByCard Class
    private static PayByCard instance = new PayByCard();

    private PayByCard() {
    }

    public static PayByCard getInstance() {
        return instance;
    }

    @Override
    public void processPayment(Client client,MakePayment makePayment) {
        //storing the price of the movie inside a variable
        double souvenir = makePayment.getSouvenirPrices();
        double foodDrinks = makePayment.getFoodDrinksPrices();
        double moviePrice = makePayment.getMoviePrice();

        System.out.println("Movie price : " + moviePrice);
        System.out.println("(basic one movie price = 30)");
        System.out.println();
        System.out.println("foodDrinks price : " + foodDrinks);
        System.out.println("(basic one food item price = 20)");
        System.out.println();
        System.out.println("souvenir items price : " + souvenir);
        System.out.println("(basic one souvenir item price = 40)");
        System.out.println();
        //deduct the money from the balance
        double  amountDedacted = souvenir + foodDrinks + moviePrice;

        System.out.println("Total Deducted amount : ");
        client.deductBalance(amountDedacted);

        // Logic for processing payment by card
        makePayment.setState(PayByCash.getInstance());
        System.out.println("Payment processed by card. Balance after deduction: " + client.getBalance());

    }
}