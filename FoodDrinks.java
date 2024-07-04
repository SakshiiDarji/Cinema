import FoodAndDrinks.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodDrinks {
    int type;

    List<Double> choices = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void seeChosenItems(List<String> listFood){

        if(listFood.isEmpty()) {
            System.out.println("No items added from Canteen yet.");
        }

        else {
            System.out.println("Added Food or Drinks items : ");
            for(int i=0; i<listFood.size(); i++  ) {

                System.out.println(listFood.get(i));
            }
        }



    }
    public void displayMenu() {
        iBuilderFoodDrink buildMexicanMenu = new BuilderMexicanFoodDrink();
        waitressFoodDrink cook = new waitressFoodDrink(buildMexicanMenu);
        cook.constructFoodDrink();
        System.out.println("Mexican Menu : ");
        cook.DisplayMenu();

        System.out.println();
        iBuilderFoodDrink buildItalianMenu = new BuilderItalianFoodDrink();
        waitressFoodDrink cook2 = new waitressFoodDrink(buildItalianMenu);
        System.out.println("Italian Menu : ");
        cook2.constructFoodDrink();
        cook2.DisplayMenu();

        System.out.println();
        iBuilderFoodDrink buildIndianMenu = new BuilderIndianFoodDrink();
        waitressFoodDrink cook3 = new waitressFoodDrink(buildIndianMenu);
        cook3.constructFoodDrink();
        System.out.println("Indian Menu : ");
        cook3.DisplayMenu();

    }

    public void DeleteFromOrder(List<String> ArrayList) {

        if(ArrayList.isEmpty()) {
            System.out.println("No items added from Canteen yet, So you can't remove anything now.");
        }

        else {
            System.out.println("Added Food or Drinks items : ");

            for (int i = 0; i < ArrayList.size(); i++) {

                System.out.println(ArrayList.get(i) + " - " + (i + 1));
            }
            int deleteType;


            System.out.print("Please enter the index(number) of food item you want to delete : ");
            deleteType = scanner.nextInt();

            while (deleteType > ArrayList.size()) {

                System.out.print("Please enter the correct index(number) that you can see with food name: ");
                deleteType = scanner.nextInt();
            }

            ArrayList.remove(deleteType - 1);

            System.out.println();
            System.out.println("Remaining Food items in the cart : ");

            for (int i = 0; i < ArrayList.size(); i++) {

                System.out.println(ArrayList.get(i));
            }

            System.out.println();
            System.out.println("If you wanna see the all remaining items in the cart from both stores, Select option 3.");
        }

    }


    public void AddFoodDrinkItems(List<String> listFood) {

        boolean status = true;
        //List<String> addedFoods = new ArrayList<>();


        while (status) {

            System.out.println("Here are Food and Drinks Menu types that you can check and add to cart!");
            System.out.println("1 - Mexican");
            System.out.println("2 - Italian");
            System.out.println("3 - Indian");
            System.out.println("4 - Exit");

            System.out.println();
            System.out.print("Enter the index of menu : ");
            type = scanner.nextInt();

            while (type < 1 || type > 4) {
                System.out.print("Please enter between (1-4) : ");
                type = scanner.nextInt();
            }

            switch (type) {

                case 1:
                    status = true;
                    iBuilderFoodDrink buildMexicanMenu = new BuilderMexicanFoodDrink();
                    waitressFoodDrink cook = new waitressFoodDrink(buildMexicanMenu);
                    cook.constructFoodDrink();
                    System.out.println();
                    System.out.println("Mexican Menu : ");
                    cook.DisplayMenu();
                    System.out.println();

                    System.out.print("Please enter the index(number) of food or drink you want:");

                    int typeFood = scanner.nextInt();

                    while (typeFood < 1 || typeFood > 4) {
                        System.out.print("Please enter between (1-4) : ");
                        typeFood = scanner.nextInt();
                    }

                    switch (typeFood) {

                        case 1:
                            System.out.println();
                            System.out.println(buildMexicanMenu.getPizza() + " successfully added to the cart.");
                            listFood.add(buildMexicanMenu.getPizza());
                            choices.add(buildMexicanMenu.getPizzaPrice());
                            System.out.println();
                            break;

                        case 2:
                            System.out.println();
                            System.out.println(buildMexicanMenu.getPopcorn() + " successfully added to the cart.");
                            listFood.add(buildMexicanMenu.getPopcorn());
                            choices.add(buildMexicanMenu.getPopcornPrice());
                            System.out.println();
                            break;

                        case 3:
                            System.out.println();
                            System.out.println(buildMexicanMenu.getSandwich() + " successfully added to the cart.");
                            listFood.add(buildMexicanMenu.getSandwich());
                            choices.add(buildMexicanMenu.getSandwichPrice());
                            System.out.println();
                            break;

                        case 4:
                            System.out.println();
                            System.out.println(buildMexicanMenu.getSoda() + " successfully added to the cart.");
                            listFood.add(buildMexicanMenu.getSoda());
                            choices.add(buildMexicanMenu.getSodaPrice());
                            System.out.println();
                            break;
                    }

                    break;

                case 2:
                    status = true;
                    iBuilderFoodDrink buildItalianMenu = new BuilderItalianFoodDrink();
                    waitressFoodDrink cook2 = new waitressFoodDrink(buildItalianMenu);
                    System.out.println();
                    System.out.println("Italian Menu : ");
                    cook2.constructFoodDrink();
                    cook2.DisplayMenu();

                    System.out.println("Please enter the index(number) of food or drink you want:");

                    int typeFood2 = scanner.nextInt();

                    while (typeFood2 < 1 || typeFood2 > 4) {
                        System.out.println("Please enter between (1-4) : ");
                        typeFood = scanner.nextInt();
                    }


                    switch (typeFood2) {

                        case 1:
                            System.out.println();
                            System.out.println(buildItalianMenu.getPizza() + " successfully added to the cart.");
                            listFood.add(buildItalianMenu.getPizza());
                            choices.add(buildItalianMenu.getPizzaPrice());
                            System.out.println();
                            System.out.println();
                            break;

                        case 2:
                            System.out.println();
                            System.out.println(buildItalianMenu.getPopcorn() + " successfully added to the cart.");
                            listFood.add(buildItalianMenu.getPopcorn());
                            choices.add(buildItalianMenu.getPopcornPrice());
                            System.out.println();
                            break;

                        case 3:
                            System.out.println();
                            System.out.println(buildItalianMenu.getSandwich() + " successfully added to the cart.");
                            listFood.add(buildItalianMenu.getSandwich());
                            choices.add(buildItalianMenu.getSandwichPrice());
                            System.out.println();
                            break;

                        case 4:
                            System.out.println();
                            System.out.println(buildItalianMenu.getSoda() + " successfully added to the cart.");
                            listFood.add(buildItalianMenu.getSoda());
                            choices.add(buildItalianMenu.getSodaPrice());
                            System.out.println();
                            break;
                    }
                    break;

                case 3:
                    status = true;
                    iBuilderFoodDrink buildIndianMenu = new BuilderIndianFoodDrink();
                    waitressFoodDrink cook3 = new waitressFoodDrink(buildIndianMenu);
                    cook3.constructFoodDrink();
                    System.out.println();
                    System.out.println("Indian Menu : ");
                    cook3.DisplayMenu();
                    System.out.println();

                    System.out.println("Please enter the index(number) of food or drink you want:");

                    int typeFood3 = scanner.nextInt();

                    while (typeFood3 < 1 || typeFood3 > 4) {
                        System.out.println("Please enter between (1-4) : ");
                        typeFood = scanner.nextInt();
                    }

                    switch (typeFood3) {

                        case 1:
                            System.out.println();
                            System.out.println(buildIndianMenu.getPizza() + " successfully added to the cart.");
                            listFood.add(buildIndianMenu.getPizza());
                            choices.add(buildIndianMenu.getPizzaPrice());
                            System.out.println();
                            break;

                        case 2:
                            System.out.println();
                            System.out.println(buildIndianMenu.getPopcorn() + " successfully added to the cart.");
                            listFood.add(buildIndianMenu.getPopcorn());
                            choices.add(buildIndianMenu.getPopcornPrice());
                            System.out.println();
                            break;

                        case 3:
                            System.out.println();
                            System.out.println(buildIndianMenu.getSandwich() + " successfully added to the cart.");
                            listFood.add(buildIndianMenu.getSandwich());
                            choices.add(buildIndianMenu.getSandwichPrice());
                            break;

                        case 4:
                            System.out.println();
                            System.out.println(buildIndianMenu.getSoda() + " successfully added to the cart.");
                            listFood.add(buildIndianMenu.getSoda());
                            choices.add(buildIndianMenu.getSodaPrice());
                            System.out.println();
                            break;
                    }
                    break;

                case 4:
                    status=false;
                    break;
            }
        }
    }
}
