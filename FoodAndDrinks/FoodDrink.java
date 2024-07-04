package FoodAndDrinks;

public class FoodDrink {

    // avoiding prices part in diagram to show as I am not using it in code further
    private String popcorn;

    private String pizza;

    private String sandwich;

    private String soda;        //for drinks
    private double price;

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

    public void setSandwich(String sandwich) {
        this.sandwich = sandwich;
    }

    public String getPopcorn() {
        return popcorn;
    }

    public void setSoda(String soda) {
        this.soda = soda;
    }

    public String getPizza() {
        return pizza;
    }

    public String getSandwich() {
        return sandwich;
    }

    public void setPopcorn(String popcorn) {
        this.popcorn = popcorn;
    }

    public String getSoda() {
        return soda;
    }
    public double getPizzaPrice(){
        return price;
    };

    public double getSodaPrice(){
        return price;
    };

    public double getPopcornPrice(){
        return price;
    };
    public double getSandwichPrice(){
        return price;
    };
    public void setPizzaPrice(double price){
        this.price = price;
    };

    public void setSodaPrice(double price){
        this.price = price;
    };

    public void setPopcornPrice(double price){
        this.price = price;
    };
    public void setSandwichPrice(double price){
        this.price = price;
    };

    public String display() {
        System.out.println("Pizaa : " + this.getPizza() + " - Index No(1)");
        System.out.println("Popcorn : " + this.getPopcorn()+ " - Index No(2)");
        System.out.println("Sandwich : " + this.getSandwich() + " - Index No(3)");
        System.out.println("Soda : " + this.getSoda() + " - Index No(4)");
        return null;
    }

}

