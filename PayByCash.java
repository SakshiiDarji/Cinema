public class PayByCash extends PaymentState {
    //create a new instance of the PayByCash Class
    private static PayByCash instance = new PayByCash();

    private PayByCash() {
    }

    public static PayByCash getInstance() {
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

        makePayment.setState(PayByCard.getInstance());
        System.out.println("Payment processed by cash. Balance after deduction: " + client.getBalance());
    }
}