package factory;

import pizza.*;

import java.util.List;

public class PizzaFactory {

    public Pizza createPizza(PizzaType pizzaType, double cost, List<String> components) {
        if (PizzaType.CAPRICIOSA.equals(pizzaType)) {
            return new CapriciosaPizza(cost, components);
        } else if (PizzaType.MARGHERITA.equals(pizzaType)) {
            return new MargheritaPizza(cost, components);
        } else if (PizzaType.HAWAI.equals(pizzaType)) {
            return new HawaiPizza(cost, components);
        }

        throw new IllegalArgumentException("Pizza type not supported");
    }

}
