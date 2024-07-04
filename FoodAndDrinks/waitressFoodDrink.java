package FoodAndDrinks;

public class waitressFoodDrink {

    // avoiding prices part in diagram to show as I am not using it in code further

    private iBuilderFoodDrink ibuilderFood;

    public waitressFoodDrink(iBuilderFoodDrink ibuilderfood) {
        this.ibuilderFood = ibuilderfood;
    }

    public void constructFoodDrink() {

        this.ibuilderFood.buildPizza();
        this.ibuilderFood.buildSandwich();
        this.ibuilderFood.buildPopcorn();
        this.ibuilderFood.buildSoda();
        this.ibuilderFood.buildPrice();
    }

    public String DisplayMenu() {

        return this.ibuilderFood.displayFoodDrinkList();
    }

    public FoodDrink getFoodDrink() {
        return ibuilderFood.getFoodDrinkList();
    }



}
