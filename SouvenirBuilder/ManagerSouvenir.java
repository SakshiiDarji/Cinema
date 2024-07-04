package SouvenirBuilder;

public class ManagerSouvenir {

    private final iBuilderSouvenir iBuilderSouvenir;

    public ManagerSouvenir(iBuilderSouvenir iBuilderSouvenir){
        this.iBuilderSouvenir = iBuilderSouvenir;
    }

    public void constructSouvenir() {
        this.iBuilderSouvenir.buildTshirt();
        this.iBuilderSouvenir.buildShoes();
        this.iBuilderSouvenir.buildJacket();
        this.iBuilderSouvenir.buildCap();
        this.iBuilderSouvenir.buildBracelet();
    }

    public void displaySouvenirItems() {
        this.iBuilderSouvenir.getSouvenirItems();
    }

    public Souvenir getSouvenir() {
        return this.iBuilderSouvenir.getSouvenir();
    }

}
