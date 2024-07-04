import java.util.List;
public class Receipt {
    private String movieName;
    private String movieType;
    private List<String> seats;
    private double moviePricePaid;
    private double foodPricePaid;
    private double souvenirPricePaid;
    private int loyaltyPoints;

    private List<String> addedFood;

    private List<String> addedSouvenirs;

    public Receipt(String movieName, List<String> seats, double moviePricePaid, double foodpricePaid, double souvenirPricePaid,
                   int loyaltyPoints, List<String> food, List<String> Souvenir) {
        this.movieName = movieName;
        // this.movieType = movieType;
        this.seats = seats;
        this.moviePricePaid = moviePricePaid;
        this.foodPricePaid = foodpricePaid;
        this.souvenirPricePaid = souvenirPricePaid;
        this.loyaltyPoints = loyaltyPoints;
        this.addedFood = food;
        this.addedSouvenirs = Souvenir;
    }

    public void printReceipt() {
        System.out.println();
        System.out.println("============= Receipt =============");
        System.out.println("Movie Name: " + this.movieName);
//        System.out.println("Movie Type: " + this.movieType);
        System.out.println("Seats Bought: " + this.seats);
        System.out.println("Price Paid: " + this.moviePricePaid);

        System.out.println("Loyalty Points Added: " + this.loyaltyPoints);

        System.out.println();
        if (addedFood.isEmpty()){
            System.out.println("No items added from Canteen.");
        }

        else {
            System.out.println("Added Food or Drinks items : ");
            for (int i = 0; i < addedFood.size(); i++) {

                System.out.println(addedFood.get(i));
            }
        }
        System.out.println("Price Paid for Food and Drinks: " + this.foodPricePaid);

        System.out.println();
        if (addedSouvenirs.isEmpty()){
            System.out.println("No items added from Souvenirs.");
        }

        else {
            System.out.println("Added Souvenir items : ");
            for (int i = 0; i < addedSouvenirs.size(); i++) {

                System.out.println(addedSouvenirs.get(i));
            }
        }
        System.out.println("Price Paid for Souvenir items: " + this.souvenirPricePaid);
        System.out.println();

    }
}
