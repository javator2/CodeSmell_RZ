package smell.pub;

public enum Ingredients {
    RUM(65), GRENADINE(10), LIME_JUICE(10), GREEN_STUFF(10), TONIC(20), GIN(85);

    private int price;
    Ingredients(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
