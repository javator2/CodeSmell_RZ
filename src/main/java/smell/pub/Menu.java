package smell.pub;

import java.util.*;

import static smell.pub.Ingredients.*;

public class Menu {


    private static Map<String, List<Integer>> menu = new HashMap<>();
    static {
        menu.put(Pub.ONE_BEER, new ArrayList<>(Arrays.asList(74)));
        menu.put(Pub.ONE_CIDER, new ArrayList<>(Arrays.asList(103)));
        menu.put(Pub.A_PROPER_CIDER, new ArrayList<>(Arrays.asList(110)));
        menu.put(Pub.GT, new ArrayList<>(Arrays.asList(GIN.getPrice(), TONIC.getPrice(), GREEN_STUFF.getPrice())));
        menu.put(Pub.BACARDI_SPECIAL, new ArrayList<>(Arrays.asList(RUM.getPrice(), GRENADINE.getPrice(), LIME_JUICE.getPrice(), GIN.getPrice()/2)));
    }

    private static Map<TypeOfDrink, List<String>> typesOfDrinks = new HashMap<>();
    static {
        typesOfDrinks.put(TypeOfDrink.BEER, Arrays.asList(Pub.ONE_BEER));
        typesOfDrinks.put(TypeOfDrink.CIDER, Arrays.asList(Pub.ONE_CIDER, Pub.A_PROPER_CIDER));
        typesOfDrinks.put(TypeOfDrink.DRINK, Arrays.asList(Pub.GT, Pub.BACARDI_SPECIAL));
    }

    public static Map<TypeOfDrink, List<String>> getTypesOfDrinks() {
        return typesOfDrinks;
    }

    public static Map<String, List<Integer>> getMenu() {
        return menu;
    }


}
