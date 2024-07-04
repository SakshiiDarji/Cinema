package FoodAndDrinks;

public class BuilderMexicanFoodDrink implements iBuilderFoodDrink {

    // avoiding prices part in diagram to show as I am not using it in code further

    private FoodDrink foodDrink;

    public BuilderMexicanFoodDrink() {
        this.foodDrink = new FoodDrink();
    }

    public void buildPizza() {
        foodDrink.setPizza("Mexican Saucy Pizza");
    }

    public void buildSandwich() {
        foodDrink.setSandwich("Mexican Chicken Sandwich");
    }

    public void buildPopcorn() {
        foodDrink.setPopcorn("Spicy Mexican Popcorn");
    }

    public void buildSoda() {
        foodDrink.setSoda("Orange Crush");
    }
    public void buildPrice(){
        foodDrink.setPizzaPrice(15);
        foodDrink.setPopcornPrice(7);
        foodDrink.setSandwichPrice(10);
        foodDrink.setSodaPrice(5);
    };

    public String getPizza() {
        return this.foodDrink.getPizza();
    }

    public String getPopcorn() {
        return this.foodDrink.getPopcorn();
    }

    public String getSoda() {
        return this.foodDrink.getSoda();
    }

    public String getSandwich() {
        return this.foodDrink.getSandwich();
    }

    public FoodDrink getFoodDrinkList() {
        return foodDrink;
    }
    public double getPizzaPrice(){
        return this.foodDrink.getPizzaPrice();
    };

    public double getSodaPrice(){
        return this.foodDrink.getSodaPrice();
    };

    public double getPopcornPrice(){
        return this.foodDrink.getPopcornPrice();
    };
    public double getSandwichPrice(){
        return this.foodDrink.getSandwichPrice();
    };
    public String displayFoodDrinkList() {
        return this.foodDrink.display();
    }
}
