import FoodAndDrinks.*;
import SouvenirBuilder.*;

import java.util.List;
import java.util.Scanner;

public class Souvenir {
    int type;
    Scanner scanner = new Scanner(System.in);

    public void displaySouvenirMenu() {
        System.out.println();
        iBuilderSouvenir MatrixSouvenir = new MatrixMovieSouvenir();
        ManagerSouvenir manager = new ManagerSouvenir(MatrixSouvenir);
        manager.constructSouvenir();
        System.out.println();
        System.out.println("Items based on 'The Matrix' Movie: ");
        System.out.println();
        manager.displaySouvenirItems();

        System.out.println();
        iBuilderSouvenir InceptionSouvenir = new InceptionMovieSouvenir();
        ManagerSouvenir manager2 = new ManagerSouvenir(InceptionSouvenir);
        manager2.constructSouvenir();
        System.out.println();
        System.out.println("Items based on 'Inception' Movie: ");
        System.out.println();
        manager2.displaySouvenirItems();

        System.out.println();
        iBuilderSouvenir JurassicParkSouvenir = new JurassicParkMovieSouvenir();
        ManagerSouvenir manager3 = new ManagerSouvenir(JurassicParkSouvenir);
        manager3.constructSouvenir();
        System.out.println();
        System.out.println("Items based on 'Jurassic Park' Movie: ");
        System.out.println();
        manager3.displaySouvenirItems();

        System.out.println();
        iBuilderSouvenir TitanicSouvenir = new TitanicMovieSouvenir();
        ManagerSouvenir manager4 = new ManagerSouvenir(TitanicSouvenir);
        manager4.constructSouvenir();
        System.out.println();
        System.out.println("Items based on 'Titanic' Movie: ");
        System.out.println();
        manager4.displaySouvenirItems();
    }

    public void seeChosenItems(List<String> listItems){

        if(listItems.isEmpty()) {
            System.out.println("No items added from Souvenir yet.");
        }

        else {
            System.out.println("Added Souvenir items : ");
            for(int i=0; i<listItems.size(); i++  ) {

                System.out.println(listItems.get(i));
            }
        }

    }

    public void removeItem(List<String> ArrayList) {

        if(ArrayList.isEmpty()) {
            System.out.println("No items added from Souvenir yet, So you can't remove anything now.");
        }

        else {
            System.out.println("Added Souvenir items : ");

            for (int i = 0; i < ArrayList.size(); i++) {

                System.out.println(ArrayList.get(i) + " - " + (i + 1));
            }
            int deleteType;


            System.out.print("Please enter the index(number) of item you want to remove : ");
            deleteType = scanner.nextInt();

            while (deleteType > ArrayList.size()) {

                System.out.print("Please enter the correct index(number) that you can see with item name: ");
                deleteType = scanner.nextInt();
            }

            ArrayList.remove(deleteType - 1);

            System.out.println();
            System.out.println("Remaining items in the cart : ");

            for (int i = 0; i < ArrayList.size(); i++) {

                System.out.println(ArrayList.get(i));
            }

            System.out.println();
            System.out.println("If you wanna see the all remaining items in the cart from both stores, Select option 3.");
        }

    }

    public void AddItems(List<String> listItems) {

        boolean status = true;
        //List<String> addedFoods = new ArrayList<>();

        System.out.println();
        System.out.println("Welcome to the souvenir store,");
        System.out.println("where you can buy T-shirts, shoes, " +
                "jackets, cap and bracelets with designs of your favourite movies and characters. ");

        while (status) {

            System.out.println();
            System.out.println("Please choose movie name from which you want to buy!");
            System.out.println("1 - The Matrix");
            System.out.println("2 - Inception");
            System.out.println("3 - Jurassic Park");
            System.out.println("4 - Titanic");
            System.out.println("5 - Exit");

            System.out.println();
            System.out.print("Enter your choice here : ");
            type = scanner.nextInt();

            while (type < 1 || type > 5) {
                System.out.print("Please enter between (1-5) : ");
                type = scanner.nextInt();
            }

            switch (type) {

                case 1:
                    status = true;
                    iBuilderSouvenir MatrixSouvenir = new MatrixMovieSouvenir();
                    ManagerSouvenir manager = new ManagerSouvenir(MatrixSouvenir);
                    manager.constructSouvenir();
                    System.out.println();
                    System.out.println("Items based on 'The Matrix' Movie: ");
                    System.out.println();
                    manager.displaySouvenirItems();
                    System.out.println();

                    System.out.print("Please enter the index(number) of Item you want:");

                    int typeItem = scanner.nextInt();

                    while (typeItem < 1 || typeItem > 5) {
                        System.out.print("Please enter between (1-5) : ");
                        typeItem = scanner.nextInt();
                    }

                    switch (typeItem) {

                        case 1:
                            System.out.println();
                            System.out.println(MatrixSouvenir.getTshirt() + " successfully added to the cart.");
                            listItems.add(MatrixSouvenir.getTshirt());
                            System.out.println();
                            break;

                        case 2:
                            System.out.println();
                            System.out.println(MatrixSouvenir.getShoes() + " successfully added to the cart.");
                            listItems.add(MatrixSouvenir.getShoes());
                            System.out.println();
                            break;

                        case 3:
                            System.out.println();
                            System.out.println(MatrixSouvenir.getJacket() + " successfully added to the cart.");
                            listItems.add(MatrixSouvenir.getJacket());
                            System.out.println();
                            break;

                        case 4:
                            System.out.println();
                            System.out.println(MatrixSouvenir.getCap() + " successfully added to the cart.");
                            listItems.add(MatrixSouvenir.getCap());
                            System.out.println();
                            break;

                        case 5:
                            System.out.println();
                            System.out.println(MatrixSouvenir.getBracelet() + " successfully added to the cart.");
                            listItems.add(MatrixSouvenir.getBracelet());
                            System.out.println();
                            break;

                    }
                    break;

                case 2:
                    status = true;
                    iBuilderSouvenir InceptionSouvenir = new InceptionMovieSouvenir();
                    ManagerSouvenir manager2 = new ManagerSouvenir(InceptionSouvenir);
                    manager2.constructSouvenir();
                    System.out.println();
                    System.out.println("Items based on 'Inception' Movie: ");
                    System.out.println();
                    manager2.displaySouvenirItems();
                    System.out.println();

                    System.out.print("Please enter the index(number) of Item you want:");

                    int typeItem2 = scanner.nextInt();

                    while (typeItem2 < 1 || typeItem2 > 5) {
                        System.out.print("Please enter between (1-5) : ");
                        typeItem2 = scanner.nextInt();
                    }

                    switch (typeItem2) {

                        case 1:
                            System.out.println();
                            System.out.println(InceptionSouvenir.getTshirt() + " successfully added to the cart.");
                            listItems.add(InceptionSouvenir.getTshirt());
                            System.out.println();
                            break;

                        case 2:
                            System.out.println();
                            System.out.println(InceptionSouvenir.getShoes() + " successfully added to the cart.");
                            listItems.add(InceptionSouvenir.getShoes());
                            System.out.println();
                            break;

                        case 3:
                            System.out.println();
                            System.out.println(InceptionSouvenir.getJacket() + " successfully added to the cart.");
                            listItems.add(InceptionSouvenir.getJacket());
                            System.out.println();
                            break;

                        case 4:
                            System.out.println();
                            System.out.println(InceptionSouvenir.getCap() + " successfully added to the cart.");
                            listItems.add(InceptionSouvenir.getCap());
                            System.out.println();
                            break;

                        case 5:
                            System.out.println();
                            System.out.println(InceptionSouvenir.getBracelet() + " successfully added to the cart.");
                            listItems.add(InceptionSouvenir.getBracelet());
                            System.out.println();
                            break;
                    }
                    break;

                case 3:
                    status = true;
                    iBuilderSouvenir JurassicParkSouvenir = new JurassicParkMovieSouvenir();
                    ManagerSouvenir manager3 = new ManagerSouvenir(JurassicParkSouvenir);
                    manager3.constructSouvenir();
                    System.out.println();
                    System.out.println("Items based on 'Jurassic Park' Movie: ");
                    System.out.println();
                    manager3.displaySouvenirItems();
                    System.out.println();

                    System.out.print("Please enter the index(number) of Item you want:");

                    int typeItem3 = scanner.nextInt();

                    while (typeItem3 < 1 || typeItem3 > 5) {
                        System.out.print("Please enter between (1-5) : ");
                        typeItem3 = scanner.nextInt();
                    }

                    switch (typeItem3) {

                        case 1:
                            System.out.println();
                            System.out.println(JurassicParkSouvenir.getTshirt() + " successfully added to the cart.");
                            listItems.add(JurassicParkSouvenir.getTshirt());
                            System.out.println();
                            break;

                        case 2:
                            System.out.println();
                            System.out.println(JurassicParkSouvenir.getShoes() + " successfully added to the cart.");
                            listItems.add(JurassicParkSouvenir.getShoes());
                            System.out.println();
                            break;

                        case 3:
                            System.out.println();
                            System.out.println(JurassicParkSouvenir.getJacket() + " successfully added to the cart.");
                            listItems.add(JurassicParkSouvenir.getJacket());
                            System.out.println();
                            break;

                        case 4:
                            System.out.println();
                            System.out.println(JurassicParkSouvenir.getCap() + " successfully added to the cart.");
                            listItems.add(JurassicParkSouvenir.getCap());
                            System.out.println();
                            break;

                        case 5:
                            System.out.println();
                            System.out.println(JurassicParkSouvenir.getBracelet() + " successfully added to the cart.");
                            listItems.add(JurassicParkSouvenir.getBracelet());
                            System.out.println();
                            break;
                    }
                    break;

                case 4:
                    status = true;
                    iBuilderSouvenir TitanicSouvenir = new TitanicMovieSouvenir();
                    ManagerSouvenir manager4 = new ManagerSouvenir(TitanicSouvenir);
                    manager4.constructSouvenir();
                    System.out.println();
                    System.out.println("Items based on 'Titanic' Movie: ");
                    System.out.println();
                    manager4.displaySouvenirItems();
                    System.out.println();

                    System.out.print("Please enter the index(number) of Item you want:");

                    int typeItem4 = scanner.nextInt();

                    while (typeItem4 < 1 || typeItem4 > 5) {
                        System.out.print("Please enter between (1-5) : ");
                        typeItem3 = scanner.nextInt();
                    }

                    switch (typeItem4) {

                        case 1:
                            System.out.println();
                            System.out.println(TitanicSouvenir.getTshirt() + " successfully added to the cart.");
                            listItems.add(TitanicSouvenir.getTshirt());
                            System.out.println();
                            break;

                        case 2:
                            System.out.println();
                            System.out.println(TitanicSouvenir.getShoes() + " successfully added to the cart.");
                            listItems.add(TitanicSouvenir.getShoes());
                            System.out.println();
                            break;

                        case 3:
                            System.out.println();
                            System.out.println(TitanicSouvenir.getJacket() + " successfully added to the cart.");
                            listItems.add(TitanicSouvenir.getJacket());
                            System.out.println();
                            break;

                        case 4:
                            System.out.println();
                            System.out.println(TitanicSouvenir.getCap() + " successfully added to the cart.");
                            listItems.add(TitanicSouvenir.getCap());
                            System.out.println();
                            break;

                        case 5:
                            System.out.println();
                            System.out.println(TitanicSouvenir.getBracelet() + " successfully added to the cart.");
                            listItems.add(TitanicSouvenir.getBracelet());
                            System.out.println();
                            break;
                    }
                    break;


                case 5:
                    status = false;
                    break;
            }
        }
    }
}
