package FoodAndDrinks;

public interface iBuilderFoodDrink {

    // avoiding prices part in diagram to show as I am not using it in code further

    public void buildPizza();

    public void buildSandwich();

    public void buildPopcorn();

    public void buildSoda();
    public void buildPrice();

    public String getPizza();

    public String getSoda();

    public String getPopcorn();
    public String getSandwich();
    public double getPizzaPrice();

    public double getSodaPrice();

    public double getPopcornPrice();
    public double getSandwichPrice();

    public String displayFoodDrinkList();

    public FoodDrink getFoodDrinkList();

}
