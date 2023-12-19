package GeekBrains.OOP.Seminar_7.Decorator;

public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+", сыр";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice()+20;
    }
}
