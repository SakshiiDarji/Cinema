import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BuyTicket {
    Database savedb = new Database();

    List<String> addedItems = new ArrayList<>();
    List<String> addedFood = new ArrayList<>();
    void start(){

    Scanner scanner = new Scanner(System.in);
        System.out.println("VIP or Regular Seat? :");
        System.out.println("1 - VIP");
        System.out.println("2 - Regular");
        System.out.print("Option: ");
    int type = scanner.nextInt();
    Seats seats = new Seats(type);
       // FoodDrinks foodDrinks = new FoodDrinks();

    // Choose movie and reserve seats
    Movie movieInstance = new Movie();
    Movie chosenMovie = movieInstance.chooseMovie();
    List<String> reservedSeats = seats.reserveSeatsInteractive(type);

    // Display final seats after reservations
       seats.displaySeats(type);

    // Create and display the ticket
    Ticket ticket = new Ticket(reservedSeats, chosenMovie,seats);
       ticket.displayTicket();
        BuyFoodsSouvenir buyFoodsSouvenir = new BuyFoodsSouvenir();
        buyFoodsSouvenir.buyFoodSouvenir();

        addedItems = buyFoodsSouvenir.addedItems;
        addedFood = buyFoodsSouvenir.addedFoods;

        System.out.print("Enter initial balance for the client: ");
            double initialBalance = scanner.nextInt();

        // Create client with initial balance
            Client client = new Client(initialBalance);

        MakePayment payment = new MakePayment(client, chosenMovie, seats,addedFood, addedItems);

       // double totalPrice = payment.getMoviePrice()  + payment.getSouvenirPrices() + payment.getFoodDrinksPrices();

        int paymentType;
        do {
            System.out.println("Choose payment type:");
            System.out.println("1. Pay By Card");
            System.out.println("2. Pay By Cash");
            System.out.println("3. Pay By Loyalty Points");

            paymentType = scanner.nextInt();

            // Process user choice
            payment.push(paymentType);

            // Check if user has enough loyalty points for payment
            if (paymentType == 3 && client.getLoyaltyPoints() < payment.getMoviePrice()) {
                // System.out.println("You don't have enough loyalty points for this payment.");
                paymentType = -1; // Set paymentType to -1 to repeat the loop
            }
        } while (paymentType == -1);

        client.setLoyaltyPoints(reservedSeats.size());
        Receipt receipt = new Receipt(chosenMovie.getName(), reservedSeats,
                payment.getMoviePrice(), payment.getFoodDrinksPrices(), payment.getSouvenirPrices(),
                client.getLoyaltyPoints(), addedFood, addedItems);

        // Print the receipt

        System.out.println("You want Receipt ? : 1. yes || 2. no");
        System.out.print("Enter choice : ");
        int choice3 = scanner.nextInt();

        while (choice3<1 || choice3>2) {
            System.out.print("please enter 1 or 2 : ");
            choice3 = scanner.nextInt();
        }

        if (choice3 == 1) {
            receipt.printReceipt();
        }

        else {
            // Close scanner
            scanner.close();
        }



        //manipulation infos to save in DB
        String seatString = String.join(",", reservedSeats);
        String souvenir = String.join(",", buyFoodsSouvenir.addedItems); //find a way to collect this
        String food = String.join(",", buyFoodsSouvenir.addedFoods); //find a way to collect this
        String typeSeat = "Regular", movieName = movieInstance.getName(), movieCategory = "Comedy", payType = "PayByCash" ;
        String date;
        Double price = payment.getMoviePrice();
        if(type == 1){
            typeSeat = "VIP";
        }
        if(movieInstance.getType()==1){
            movieCategory="Action";
        }
        if(paymentType == 1){
            payType = "PayByCard";
        }

        //getting current date.
        LocalDate currentDate = LocalDate.now();

        // format date (yyyy/MM/dd)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String formattedDate = currentDate.format(formatter);
        date = formattedDate;



        //Save information in the Database
        savedb.saveInfo(date,movieName,movieCategory,typeSeat,seatString,souvenir,food,price,payType);



        //savedb.readData();
    }
}
