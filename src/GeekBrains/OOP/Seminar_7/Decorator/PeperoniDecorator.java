package GeekBrains.OOP.Seminar_7.Decorator;

public class PeperoniDecorator extends PizzaDecorator {
    public PeperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+", пепперони";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice()+35;
    }
}
