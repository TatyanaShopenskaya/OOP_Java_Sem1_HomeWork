package GeekBrains.OOP.Seminar_7.Decorator;

import GeekBrains.OOP.Seminar_7.Decorator.CheeseDecorator;
import GeekBrains.OOP.Seminar_7.Decorator.PeperoniDecorator;
import GeekBrains.OOP.Seminar_7.Decorator.Pizza;
import GeekBrains.OOP.Seminar_7.Decorator.PizzaDough;

public class MainDecorator {
    public static void main(String[] args) {
        Pizza pizza = new PeperoniDecorator(new CheeseDecorator(new PizzaDough()));
        printPizza(pizza);
    }
    static void printPizza(Pizza pizza){
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getPrice());
    }
}
