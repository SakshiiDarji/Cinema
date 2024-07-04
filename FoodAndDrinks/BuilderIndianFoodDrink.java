package FoodAndDrinks;

public class BuilderIndianFoodDrink implements iBuilderFoodDrink {

    // avoiding prices part in diagram to show as I am not using it in code further

    private FoodDrink foodDrink;

    public BuilderIndianFoodDrink() {
        this.foodDrink = new FoodDrink();
    }

    public void buildPizza() {
        foodDrink.setPizza("Cheesy Margarita Pizza");
    }

    public void buildSandwich() {
        foodDrink.setSandwich("Vegetable Club Sandwich");
    }

    public void buildPopcorn() {
        foodDrink.setPopcorn("Peri Peri Popcorn");
    }

    public void buildSoda() {
        foodDrink.setSoda("Indian Thumbs-up");
    }
    public void buildPrice(){
        foodDrink.setPizzaPrice(15);
        foodDrink.setPopcornPrice(7);
        foodDrink.setSandwichPrice(10);
        foodDrink.setSodaPrice(5);
    };

    public FoodDrink getFoodDrinkList() {
        return foodDrink;
    }

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
    public String displayFoodDrinkList(){
        return this.foodDrink.display();
    }
}
