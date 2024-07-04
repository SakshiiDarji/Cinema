package SouvenirBuilder;

public interface iBuilderSouvenir {

    public void buildTshirt();
    public void buildShoes();
    public void buildJacket();
    public void buildCap();
    public void buildBracelet();

    public String getTshirt();

    public String getShoes();
    public String getJacket();
    public String getCap();
    public String getBracelet();

    public String getSouvenirItems();

    public Souvenir getSouvenir();

}
