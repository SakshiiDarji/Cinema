import FoodAndDrinks.BuilderMexicanFoodDrink;
import FoodAndDrinks.iBuilderFoodDrink;
import FoodAndDrinks.waitressFoodDrink;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BuyFoodsSouvenir {
    int choice;
    FoodDrinks buyFood = new FoodDrinks();
    Souvenir buySouvenir = new Souvenir();
    List<String> addedFoods = new ArrayList<>();

    List<String> addedItems = new ArrayList<>();
    public void buyFoodSouvenir(){
        Scanner scanner = new Scanner(System.in);

        boolean statusMain = true;

        System.out.println();
        System.out.println("Here, you can find two stores from which you can buy things : ");
        System.out.println("One : canteen to buy food and drinks ");
        System.out.println("Second : Souvenir");

        System.out.println();
        System.out.println("*****If you do not want to buy anything.." +
                "you can simply select the exit option and can skip this part.*****");

        while (statusMain) {

            System.out.println();
            System.out.println("Please select one of following option to start.");
            System.out.println("1 - See the Menu");
            System.out.println("2 - Add Items to the cart");
            System.out.println("3 - See all the chosen items (Food, drinks, or Souvenirs)");
            System.out.println("4 - Remove Item from the cart");
            System.out.println("5 - Exit");

            System.out.println();
            System.out.print("Enter your choice : ");
            choice = scanner.nextInt();

            while (choice < 1 || choice > 5) {
                System.out.print("Please enter between (1-5) : ");
                choice = scanner.nextInt();
            }

            switch (choice) {

                case 1:
                    System.out.println();
                    System.out.println("1. See the menu for Foods or Drinks: ");
                    System.out.println("2. See the Souvenirs Menu: ");
                    System.out.print("Enter your choice : ");
                    choice = scanner.nextInt();
                    System.out.println();
                    switch (choice) {
                        case 1:
                            System.out.println();
                            this.buyFood.displayMenu();
                            break;
                        case 2:
                            this.buySouvenir.displaySouvenirMenu();
                            break;
                    }
                    break;

                case 2:
                    System.out.println();
                    System.out.println("1. Buy Foods or Drinks: ");
                    System.out.println("2. Buy Souvenirs: ");
                    System.out.print("Enter your choice : ");
                    choice = scanner.nextInt();
                    System.out.println();
                    switch (choice){
                        case 1 :
                            System.out.println();
                            this.buyFood.AddFoodDrinkItems(addedFoods);
                            break;
                        case 2:
                            this.buySouvenir.AddItems(addedItems);
                            break;
                    }
                    break;

                case 3:
                    System.out.println();
                    this.buyFood.seeChosenItems(addedFoods);
                    System.out.println();
                    this.buySouvenir.seeChosenItems(addedItems);
                    break;

                case 4:
                    System.out.println("Please select from which store you want to remove the item : ");
                    System.out.println("1 - Canteen (Food and Drinks)");
                    System.out.println("2 - Souvenir");
                    System.out.println();
                    System.out.print("Enter your choice : ");
                    int choiceDelete = scanner.nextInt();

                    while (choiceDelete<1 || choiceDelete>2) {
                        System.out.println("Please choose 1 or 2 : ");
                    }

                    switch (choiceDelete) {

                        case 1:
                            this.buyFood.DeleteFromOrder(addedFoods);
                            break;

                        case 2:
                            this.buySouvenir.removeItem(addedItems);
                            break;
                    }
                    break;

                case 5:
                    statusMain = false;
                    break;

            }
        }
    }
}
