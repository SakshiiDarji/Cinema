package SouvenirBuilder;

public class JurassicParkMovieSouvenir implements iBuilderSouvenir {

    private Souvenir souvenir = new Souvenir();
    public void buildTshirt() {
        this.souvenir.setTshirt("Jurassic Park Designed shirt");
    }

    public void buildShoes() {
        this.souvenir.setShoes("Jurassic Park Designed Shoes");
    }

    public void buildJacket() {
        this.souvenir.setJacket("Jurassic Park Designed Jacket");
    }

    public void buildCap() {
        this.souvenir.setCap("Jurassic Park Designed Cap");
    }

    public void buildBracelet() {
        this.souvenir.setBracelet("Jurassic Park Designed Bracelet");
    }

    public String getTshirt() {
        return this.souvenir.getTshirt();
    }

    public String getShoes() {
        return this.souvenir.getShoes();
    }

    public String getJacket() {
        return this.souvenir.getJacket();
    }

    public String getCap() {
        return this.souvenir.getCap();
    }

    public String getBracelet() {
        return this.souvenir.getBracelet();
    }

    public String getSouvenirItems() {
        return this.souvenir.display();
    }

    public Souvenir getSouvenir() {
        return null;
    }
}
