package SouvenirBuilder;

public class Souvenir {

    //creating properties for souvenir items, like tshirt, shoes....
    // we have this items for movies named "The Matrix", "Inception", "Jurassic Park", "Titanic".

    private String Tshirt;

    private String shoes;

    private String cap;

    private String jacket;

    private String bracelet;

    public String getTshirt() {
        return this.Tshirt;
    }

    public String getShoes() {
        return this.shoes;
    }

    public String getCap() {
        return this.cap;
    }
    public String getJacket() {
        return this.jacket;
    }

    public String getBracelet() {
        return this.bracelet;
    }

    public void setTshirt(String tshirt) {
        this.Tshirt = tshirt;
    }

    public void setJacket(String jacket) {
        this.jacket = jacket;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public void setShoes(String shoes) {
        this.shoes = shoes;
    }

    public void setBracelet(String bracelet) {
        this.bracelet = bracelet;
    }

    public String display() {
        System.out.println("Tshirt : " + this.getTshirt() + " - Index No(1)");
        System.out.println("Shoes : " + this.getShoes()+ " - Index No(2)");
        System.out.println("Jacket : " + this.getJacket() + " - Index No(3)");
        System.out.println("Cap : " + this.getCap() + " - Index No(4)");
        System.out.println("Bracelet : " + this.getBracelet() + " - Index No(5)");

        return null;
    }

}
