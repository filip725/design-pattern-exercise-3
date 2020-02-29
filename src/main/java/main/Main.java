package main;

import factory.PizzaFactory;
import pizza.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CapriciosaPizza capriciosaPizza = new CapriciosaPizza(31.99,Arrays.asList("cheese","champignons","ham"));
        HawaiPizza hawaiPizza = new HawaiPizza(29.99,Arrays.asList("cheese","pineaple","ham"));
        MargheritaPizza margheritaPizza = new MargheritaPizza(24, Arrays.asList("cheese", "ham"));

//        capriciosaPizza.showPizzaInfo();
////        hawaiPizza.showPizzaInfo();
////        margheritaPizza.showPizzaInfo();

Pizza pizzaFactory = new PizzaFactory().createPizza(PizzaType.CAPRICIOSA, 31.99,Arrays.asList("cheese", "ham"));
        System.out.println(pizzaFactory.toString());
    }

}
