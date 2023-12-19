package GeekBrains.OOP.Seminar_7.Decorator;

public class PizzaDough implements Pizza{  //тесто для пиццы

    @Override
    public String getDescription() {
        return ("Тесто");
    }

    @Override
    public double getPrice() {
        return (150);
    }
}
