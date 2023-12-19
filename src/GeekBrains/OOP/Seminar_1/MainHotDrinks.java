package GeekBrains.OOP.Seminar_1;

import java.util.ArrayList;
import java.util.List;

public class MainHotDrinks {
    public static void main(String[] args) {
        List<Product> hotDrinks = new ArrayList<>();
        hotDrinks.add(new HotDrink("Black tea", 50, 200, 40));
        hotDrinks.add(new HotDrink("Green tea", 60, 250, 30));
        hotDrinks.add(new HotDrink("Black tea", 25, 100, 45));
        hotDrinks.add(new HotDrink("Black tea", 35, 220, 25));
        hotDrinks.add(new HotDrink("Cacao", 35, 220, 25));
        hotDrinks.add(new HotDrink("Cappuccino", 35, 220, 25));
        hotDrinks.add(new HotDrink("Cappuccino", 35, 100, 25));
        hotDrinks.add(new HotDrink("Cappuccino", 35, 100, 40));

        //System.out.println(hotDrinks);
        System.out.println("--------------");
        HotDrinkVendingMachine tea = new HotDrinkVendingMachine();
        tea.initsProducts(hotDrinks);
        HotDrinkVendingMachine coffee = new HotDrinkVendingMachine();
        coffee.initsProducts(hotDrinks);

        System.out.println(tea.getProduct("Black tea", 100, 45));
        System.out.println(coffee.getProduct("Cappuccino", 100, 40));
    }
}

