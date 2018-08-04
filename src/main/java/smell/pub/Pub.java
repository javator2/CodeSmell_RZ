package smell.pub;

public class Pub {

    public static final String ONE_BEER = "hansa";
    public static final String ONE_CIDER = "grans";
    public static final String A_PROPER_CIDER = "strongbow";
    public static final String GT = "gt";
    public static final String BACARDI_SPECIAL = "bacardi_special";

    public static final int STUDENT_DISCOUNT = 10;

    public int computeCost(String drink, boolean student, int amount) {

        if(amount > 2 && Menu.getTypesOfDrinks().get(TypeOfDrink.DRINK).contains(drink)) throw new RuntimeException("Too many drinks, max 2.");
        if(!Menu.getMenu().containsKey(drink)) throw new RuntimeException("No such drink exists");

        int price = Menu.getMenu().get(drink).stream().mapToInt(Integer::intValue).sum();

        TypeOfDrink typeOfDrink = getDrinkTypeByName(drink);
        if (student && (typeOfDrink == TypeOfDrink.BEER || typeOfDrink == TypeOfDrink.CIDER)) {
            price = price - price / STUDENT_DISCOUNT;
        }
        return price*amount;
    }

    public TypeOfDrink getDrinkTypeByName(String name) {
        final TypeOfDrink[] keys = new TypeOfDrink[1];
        Menu.getTypesOfDrinks().forEach((key, value) -> {
            if(value.contains(name)) {
                keys[0] = key;
            }
        });
        return keys[0];
    }
}